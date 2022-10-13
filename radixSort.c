#include <stdio.h>

/* Radix sort */
// getmax() function
int getMax (int array[], int size) {

        int max = array[0];
        for(int i = 1; i < size; i++) {
                if(array[i] > max)
                        max = array[i];
        }
        return max;
}

// Counting Sort
void countingSort(int array[], int size, int place) {
  int output[size + 1];
  int max = (array[0] / place) % 10;

  for (int i = 1; i < size; i++) {
    if (((array[i] / place) % 10) > max)
      max = array[i];
  }
  int count[max + 1];

  for (int i = 0; i < max; ++i)
    count[i] = 0;

  for (int i = 0; i < size; i++)
    count[(array[i] / place) % 10]++;
    
  for (int i = 1; i < 10; i++)
    count[i] += count[i - 1];
    
  for (int i = size - 1; i >= 0; i--) {
    output[count[(array[i] / place) % 10] - 1] = array[i];
    count[(array[i] / place) % 10]--;
  }

  for (int i = 0; i < size; i++)
    array[i] = output[i];
}

// Radix Sort function
int radixSort (int array[], int size) {

        int max = getMax(array, size);

        for (int place = 1; max / place > 0; place *= 10) {
                countingSort(array, size, place);
        }
}

// Print Array function
void printArray (int array[], int size) {

	for (int i = 0; i < size; i++) {
		printf("%d ", array[i]);
	}
	printf("\n");
}

// Driver code
int main() {
    int array[] = {170, 45, 75, 90, 802, 24, 2, 66};
	int size = sizeof(array) / sizeof(array[0]);

	printf("Array before sorting ");
	printArray(array, size);
	printf("\n");

	radixSort(array, size);

	printf("Array after sorting  ");
    printArray(array, size);
    printf("\n");
    
    return 0;
}
