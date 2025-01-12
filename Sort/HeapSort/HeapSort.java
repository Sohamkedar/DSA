package HeapSort;

public class HeapSort {

    // Function to perform heap sort
    public static void heapSort(int[] array) {
        int n = array.length;

        // Build a max heap (rearrange the array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // One by one extract elements from the heap
        for (int i = n - 1; i >= 1; i--) {
            // Swap the root (maximum element) with the last element
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Heapify the root of the tree
            heapify(array, i, 0);
        }
    }

    // To heapify a subtree rooted at index i, where n is the size of the heap
    private static void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap the root with the largest element
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(array, n, largest);
        }
    }

    // Helper function to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array: ");
        printArray(array);

        heapSort(array); // Sorting the array using Heap Sort

        System.out.println("\nSorted Array: ");
        printArray(array);
    }
}
