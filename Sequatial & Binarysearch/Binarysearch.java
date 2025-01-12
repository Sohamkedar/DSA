package Binarysearch;
public class Binarysearch {
public static int binarySearch(char[] arr, char target) {
int left = 0;
int right = arr.length - 1;
while (left <= right) {
int mid = left + (right - left) / 2;
// Check if target is present at mid
if (arr[mid] == target) {
return mid;
}
// If target is greater, ignore the left half
if (arr[mid] < target) {
left = mid + 1;
}
// If target is smaller, ignore the right half
else {
right = mid - 1;
}
}
return -1; // Element not found
}
public static void main(String[] args) {
char[] arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
char target = 'J';

int result = binarySearch(arr, target);
if (result == -1) {
System.out.println("Element not found.");
} else {
System.out.println("Binary Search: Element found at index: " + result);
}
}
}