//
// Created by hasan on 10/27/2016 AD.
//

#include "merge_sort_header.h"

void merge(LIST_TYPE* array, int firstPart ,int secondPart){
    int len = (secondPart - firstPart) * 2 , first = firstPart , second = secondPart;
    LIST_TYPE result[len];
    for(int i = 0 ; i < len ; i++){
        if (firstPart >= second){
            result[i] = array[secondPart++];
            continue;
        } else if (secondPart >= first + len){
            result[i] = array[firstPart++];
            continue;
        }
        result[i] = array[firstPart] > array[secondPart] ? array[secondPart++] : array[firstPart++];
    }
    for(int i = 0 ; i < len ; i++)
        array[i + first] = result[i];
}

void merge_sort(LIST_TYPE* array , int first , int last){
    if((last - first) == 1){
        if (array[first] > array[last]){
            array[first] += array[last];
            array[last] = array[first] - array[last];
            array[first] = array[first] - array[last];
        }
        return;
    }
    merge_sort(array , first , (last + first) / 2);
    merge_sort(array , (last + first) / 2  + 1, last);
    merge(array , first , (last + first) / 2  + 1);
}

