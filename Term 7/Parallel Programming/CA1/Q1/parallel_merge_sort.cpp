//
// Created by hasan on 10/27/2016 AD.
//

#include "merge_sort_header.h"


void pri(__m128* a , int first , int num){
    cout << "array : " << endl;
    for (int i = 0; i < num; ++i) {
        LIST_TYPE reg[4];
        _mm_store_ps(reg, a[first + i]);
        print_list(reg , 4);
    }
}

void merge_SIMD(__m128 *array, int first, int second ,int len){
    if (len == 1){
        merge_4x4_32bit(array[first] , array[second]);
        return;
    }
    merge_SIMD(array , first, second , len / 2);
    merge_SIMD(array , first + len / 2 , second + len / 2, len / 2);
    merge_SIMD(array , first + len / 2,  second , len / 2);
//    if (len == 4){
//        pri(array , first , 4);
//    }
}

void merge_4x4_32bit(__m128 &vA,__m128 &vB) {
    __m128 vMin = _mm_min_ps(vA, vB);
    __m128 vMax = _mm_max_ps(vA, vB);
    vMin = _mm_alignr_epi8(vMin, vMin, 4);
    vA = _mm_min_ps(vMin, vMax);
    vMax = _mm_max_ps(vMin, vMax);
    vMin = _mm_alignr_epi8(vA, vA, 4);
    vA = _mm_min_ps(vMin, vMax);
    vMax = _mm_max_ps(vMin, vMax);
    vMin = _mm_alignr_epi8(vA, vA, 4);
    vA = _mm_min_ps(vMin, vMax);
    vB = _mm_max_ps(vMin, vMax);
    vA = _mm_alignr_epi8(vA, vA, 4);
}

void merge_sort_SIMD(__m128* array , int first , int last){

    if((last - first) == 0){
        LIST_TYPE reg[4];
        _mm_store_ps(reg, array[first]);
        LIST_TYPE
            min1 = fmin(reg[0] , reg[1]) ,
            max1 = fmax(reg[0] , reg[1]) ,
            min2 = fmin(reg[2] , reg[3]) ,
            max2 = fmax(reg[2] , reg[3]) ;
        reg[0] = fmin(min1 , min2);
        reg[3] = fmax(max1 , max2);
        reg[1] = fmin(fmax(min1 , min2) , fmin(max1 , max2));
        reg[2] = fmax(fmax(min1 , min2) , fmin(max1 , max2));
        array[first] = _mm_load_ps (reg);
        return;
    }
    merge_sort_SIMD(array , first , (last + first) / 2);
    merge_sort_SIMD(array , (last + first) / 2  + 1, last);
    merge_SIMD(array, first, (last + first) / 2  + 1 , (last - first + 1) / 2);
}