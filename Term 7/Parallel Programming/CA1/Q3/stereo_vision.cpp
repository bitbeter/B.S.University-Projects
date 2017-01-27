//
// Created by hasan on 10/28/2016 AD.
//

#include <opencv2/core/core.hpp>
#include <opencv2/highgui/highgui.hpp>
#include <iostream>
#include "time.h"
#include "x86intrin.h"

using namespace cv;
using namespace std;

int main( )
{
    IplImage *in_img;
    IplImage *out_img;
    IplImage *out_img2;
    unsigned char *in_image;
    unsigned char *out_image;


    clock_t start, end;
    double time1 = 0, time2 = 0;

    // LOAD image
    in_img = cvLoadImage("lenna.png", CV_LOAD_IMAGE_GRAYSCALE);   // Read the file "image.jpg".
    out_img = cvCreateImage (cvGetSize(in_img), IPL_DEPTH_8U, 1);
    out_img2 = cvCreateImage (cvGetSize(in_img), IPL_DEPTH_8U, 1);


    if(! in_img )  // Check for invalid input
    {
        cout <<  "Could not open or find the image" << std::endl ;
        return -1;
    }

    in_image  = (unsigned char *) in_img->imageData;
    out_image = (unsigned char *) out_img->imageData;


    start = clock();
    for (int i = 0; i < 256; i++)
        for (int j = 0; j < 256; j++)
            if (*(in_image + i * 256 + j) < 127)
                *(out_image + i * 256 + j) = 0;
            else
                *(out_image + i * 256 + j) = 255;
    end   = clock();
    time1 = end - start;

    __m128i *pSrc;
    __m128i *pRes;
    __m128i m1, m2, m3;

    pSrc = (__m128i *) in_img->imageData;
    pRes = (__m128i *) out_img2->imageData;

    start = clock();
    m2 = _mm_set1_epi8 ((unsigned char) 0XEF);
    for (int i = 0; i < 256; i++)
        for (int j = 0; j < 16; j++)
        {
            m1 = _mm_loadu_si128(pSrc + i * 16 + j) ;
            m3 = _mm_cmplt_epi8 (m1, m2);
            _mm_store_si128 (pRes + i * 16 + j, m3);
        }
    end   = clock();
    time2 = end - start;

    //DISPLAY image
    namedWindow( "input", CV_WINDOW_AUTOSIZE ); // Create a window for display.
    cvShowImage( "input", in_img ); 			// Show our image inside it.
    namedWindow( "output", CV_WINDOW_AUTOSIZE ); // Create a window for display.
    cvShowImage( "output", out_img2 ); 			// Show our image inside it.

    waitKey(0);                       	// Wait for a keystroke in the window

    printf ("Serial Run time = %f \n", time1);
    printf ("Parallel Run time = %f \n",  time2);
    printf ("Speedup = %4.2f", (float) (time1)/(float) time2);

    return 0;
}
