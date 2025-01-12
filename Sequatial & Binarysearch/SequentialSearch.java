package Binarysearch;
public class SequentialSearch {
public static int sequentialSearch(char[] arr, char target) {
for (int i = 0; i < arr.length; i++) {
if (arr[i] == target) {
return i; // Return the index of the target element
}
}
return -1; // Element not found
}
public static void main(String[] args) {
char[] arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
char target = 'J';

int result = sequentialSearch(arr, target);
if (result == -1) {
System.out.println("Element not found.");
} else {
System.out.println("Sequential Search: Element found at index: " +
result);
}
}
}