//
// Created by hasan on 10/27/2016 AD.
//

#ifndef PPL_MERGE_SORT_DEFNIES_H
#define PPL_MERGE_SORT_DEFNIES_H

#include <iostream>
#include <vector>
#include <x86intrin.h>
#include <time.h>
#include <cmath>
using namespace std;

#define ARRAY_SIZE 4
#define log(x) cout << #x << " : " << x << endl;
#define LIST_TYPE float

void print_list(LIST_TYPE* array , int size);
void merge(LIST_TYPE* array, int firstPart ,int secondPart);
void merge_sort(LIST_TYPE* array , int first , int last);
bool is_sorted(LIST_TYPE *list , LIST_TYPE *dest, int size);
void merge_SIMD(__m128 *array, int first, int last);
void merge_4x4_32bit(__m128 &vA,__m128 &vB );
void merge_sort_SIMD(__m128* array , int first , int last);

#endif //PPL_MERGE_SORT_DEFNIES_H
