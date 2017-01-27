#include "merge_sort_header.h"

#include "serial_merge_sort.cpp"
#include "parallel_merge_sort.cpp"

bool is_sorted(LIST_TYPE *list , LIST_TYPE *dest , int size){
    vector<LIST_TYPE> sorted (dest, dest+size);
    std::sort (sorted.begin(), sorted.begin()+size);
    int i = 0;
    for (vector<LIST_TYPE>::iterator it=sorted.begin(); it!=sorted.end(); ++it , ++i)
        if (*it != list[i])
            return false;
    return true;
}

void print_list(LIST_TYPE* array , int size){
//    cout << "array :" << endl;
    for (int i = 0; i < size; ++i) {
        cout << "\t" << array[i] << endl;
    }
}

int main(){

    clock_t start, end;
    double time1 = 0, time2 = 0;
    LIST_TYPE array[ARRAY_SIZE] , serial[ARRAY_SIZE] , parallel[ARRAY_SIZE];


    // init

    for (int j = 0; j < 20000; ++j) {
        for (int i = 0; i < ARRAY_SIZE; i++){
            parallel[i] = serial[i] = array [i] = (LIST_TYPE) rand();
        }

        // serial part
        start = clock ();
        merge_sort(serial , 0 , ARRAY_SIZE - 1);
        end = clock ();
        time1 += (double) (end - start);

        // parallel part
        start = clock ();
        __m128 parallelM128[ARRAY_SIZE / 4];
        for (int i = 0; i < ARRAY_SIZE / 4; ++i) {
            parallelM128[i] = _mm_load_ps(parallel + (i * 4));
        }
        merge_sort_SIMD(parallelM128 , 0 , (ARRAY_SIZE / 4) - 1 ) ;
        for (int i = 0; i < ARRAY_SIZE / 4; ++i) {
            _mm_store_ps(parallel + (i * 4) , parallelM128[i]);
        }
        end = clock ();
        time2 += (double) (end - start);

    }

    // printing results
    printf ("average speedup : %f\n", time1 / time2);

    return 0;
}