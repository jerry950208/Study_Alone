//https://www.youtube.com/watch?v=cWH49IKDIiI&t=189s(코딩하는 거니)
#include <stdio.h>
#include <stdlib.h>

void QuickSort(int arr[], int left, int right);
int Partition(int arr[], int left, int right);
void swap(int *a, int *b);

int main(void){
	int data[10] = {2, 9, 4, 18, 5, 1, 7, 8, 15, 12};

	QuickSort(data,0,9);

	for(int i=0; i<10; i++)
		printf("%d ",data[i]);
	printf("\n");

	return 0;
}

void QuickSort(int arr[], int left, int right){
	
	
	if(left < right){

		int p = Partition(arr, left, right);
		QuickSort(arr, left, p-1);
		QuickSort(arr, p+1, right);
	}
	
	return;
}

int Partition(int arr[], int left, int right){
	
	int pivot = arr[right];		// 기준점(가장 오른쪽)
	int i = (left - 1);			// 하나씩 검사? 하는 변수
	
	for(int j = left; j<right; j++){

		if(arr[j] <= pivot){
			i++;
			swap(&arr[i], &arr[j]);
		}
	}
	swap(&arr[i + 1], &arr[right]);

	return (i + 1);
}

void swap(int *a, int *b){
	int tmp;
	tmp = *a;
	*a = *b;
	*b = tmp;
}
