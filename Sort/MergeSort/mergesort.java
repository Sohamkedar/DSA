package MergeSort;
import java.util.Arrays;
 class MergeSort {
// Main function to sort an array using Merge Sort
public static void mergeSort(int[] array) {
if (array.length < 2) {
return; // Base case: if the array has one or no elements, it's already sorted
}
int mid = array.length / 2;
// Split the array into two halves
int[] left = Arrays.copyOfRange(array, 0, mid);
int[] right = Arrays.copyOfRange(array, mid, array.length);
// Recursively sort both halves
mergeSort(left);
mergeSort(right);

// Merge the sorted halves
merge(array, left, right);
}
// Merges two sorted arrays into a single sorted array
private static void merge(int[] array, int[] left, int[] right) {
int i = 0; // Index for left array
int j = 0; // Index for right array
int k = 0; // Index for merged array

// Merge the two arrays while both have elements
while (i < left.length && j < right.length) {
if (left[i] <= right[j]) {
array[k++] = left[i++];
} else {
array[k++] = right[j++];
}
}

// If there are remaining elements in the left array
while (i < left.length) {
array[k++] = left[i++];
}

// If there are remaining elements in the right array
while (j < right.length) {
array[k++] = right[j++];
}

}

// Helper function to print the array
public static void printArray(int[] array) {
System.out.println(Arrays.toString(array));
}

public static void main(String[] args) {
int[] array = {38, 27, 43, 3, 9, 82, 10};

System.out.println("Original Array: ");
printArray(array);

mergeSort(array); // Sorting the array using Merge Sort

System.out.println("\nSorted Array: ");
printArray(array);
}
}