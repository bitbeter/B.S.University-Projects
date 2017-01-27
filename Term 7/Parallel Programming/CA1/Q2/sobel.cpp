#include <iostream>
#include <cmath>
#include <x86intrin.h>
#include <opencv2/core/core.hpp>
#include <opencv2/highgui/highgui.hpp>

using namespace cv;
using namespace std;

#define KERNEL_SIZE 3
#define IMAGE_PATH "Lenna.png"


char* calculate_gradient_serial(char *image_data, int img_width, int img_height, char kernel[][KERNEL_SIZE])
{
    char *Gx = new char[img_width*img_height];
    int sum, middle_offset = KERNEL_SIZE/2;
    int row, column, kx, ky; //k for kernel
    
    for(int i=0; i<img_height; i++) {
        for(int j=0; j<img_width; j++) {
            sum = 0;
            for(int x=0; x<KERNEL_SIZE; x++) {
                for(int y=0; y<KERNEL_SIZE; y++) {
                    row = (i+x-middle_offset < 0 || i+x-middle_offset > img_height) ? 0 : x - middle_offset;
                    column = (j+y-middle_offset < 0 || j+y-middle_offset > img_width) ? 0 : y - middle_offset;
                    kx = -x + middle_offset*2;
                    ky = -y + middle_offset*2;
                    sum += image_data[(i+row)*img_width + j + column] * kernel[x][y];
                }
            }
            Gx[i*img_width + j] = sum;
        }
    }
    return Gx;
}


char* sobel_simd(IplImage *image)
{
    char *image_data = (char*) image->imageData;
    int img_width = image->width;
    int img_height = image->height;
    char *Gx = new char[img_width*img_height];
    char *Gy = new char[img_width*img_height];
    __m128i r1, r2, r3, r4, r6 , r7 , r8 , r9 , temp;
    for(int i=0; i<img_height - 2; i++) {
        for(int j=0; j<img_width; j+=16) {
            temp = r1 =_mm_loadu_si128((__m128i*) (image_data + img_width*i + j));
            r2 =_mm_loadu_si128((__m128i*) (image_data + img_width*i + j + 1));
            r3 =_mm_loadu_si128((__m128i*) (image_data + img_width*i + j + 2));
            r4 =_mm_loadu_si128((__m128i*) (image_data + img_width*(i + 1) + j));
            r6 =_mm_loadu_si128((__m128i*) (image_data + img_width*(i + 1) + j + 2));
            r7 =_mm_loadu_si128((__m128i*) (image_data + img_width*(i + 2) + j));
            r8 =_mm_loadu_si128((__m128i*) (image_data + img_width*(i + 2) + j + 1));
            r9 =_mm_loadu_si128((__m128i*) (image_data + img_width*(i + 2) + j + 2));
            r1 = _mm_subs_epi8(r3 , r1);
            r4 = _mm_subs_epi8(r6 , r4);
            r4 = _mm_adds_epi8(r4, r4);
            r6 = _mm_subs_epi8(r9 , r7);
            r1 = _mm_adds_epi8(r6 , _mm_adds_epi8(r1 , r4));
            temp = _mm_subs_epi8(r7 , temp);
            r2 = _mm_subs_epi8(r8 , r2);
            r2 = _mm_adds_epi8(r2, r2);
            r9 = _mm_subs_epi8(r9 , r3);
            r9 = _mm_adds_epi8(r9 , _mm_adds_epi8(r2 , temp));
            _mm_storeu_si128((__m128i*) (Gx + img_width*(i + 1) + (j + 1)) , r1);
            _mm_storeu_si128((__m128i*) (Gy + img_width*(i + 1) + (j + 1)) , r9);
        }
    }
    for(int i=0; i<img_width*img_height; i++)
        Gx[i] = sqrt(Gx[i]*Gx[i] + Gy[i]*Gy[i]);
    return Gx;
}


char* sobel_serial(IplImage *image, char x_kernel[][KERNEL_SIZE], char y_kernel[][KERNEL_SIZE])
{
    char *image_data = (char*) image->imageData;
    int img_width = image->width;
    int img_height = image->height;
    char* Gx = calculate_gradient_serial(image_data, img_width, img_height, x_kernel);
    char* Gy = calculate_gradient_serial(image_data, img_width, img_height, y_kernel);
    for(int i=0; i<img_width*img_height; i++)
        Gx[i] = sqrt(Gx[i]*Gx[i] + Gy[i]*Gy[i]);
    delete Gy;
    return Gx;
}


void show_image(const char* name, IplImage *image)
{
    namedWindow(name, CV_WINDOW_AUTOSIZE);
    cvShowImage(name, image);
}


int main()
{
    IplImage *image , *dest;
    image = cvLoadImage(IMAGE_PATH, CV_LOAD_IMAGE_GRAYSCALE);
    dest = cvLoadImage(IMAGE_PATH, CV_LOAD_IMAGE_GRAYSCALE);

    char x_kernel[KERNEL_SIZE][KERNEL_SIZE] = {
        {-1,   0,   1},
        {-2,   0,   2},
        {-1,   0,   1}
    };

    char y_kernel[KERNEL_SIZE][KERNEL_SIZE] = {
        {-1,  -2,  -1},
        { 0,   0,   0},
        { 1,   2,   1}
    };
    
    clock_t start, end;
    double time1 = 0, time2 = 0;

    // for (int j = 0; j < 2000; ++j) {
        start = clock ();
        dest->imageData = sobel_serial(image, x_kernel, y_kernel);
        end = clock();
        time1 += end - start;
        show_image("serial", dest);
        start = clock ();
        dest->imageData = sobel_simd(image);
        end = clock();
        time2 += end - start;
        show_image("simd", dest);
        waitKey(0);
    // }
    cout << time1 / time2 << endl;

    return 0;
}

