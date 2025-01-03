class Sorting {

     // Bubble Sort
    // This algorithm repeatedly compares adjacent elements and swaps them if they are in the wrong order. It "bubbles" the largest element to the end of the array in each pass.
    void bubble_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("Array after Bubble Sort:");
        printArray(arr);
    }

    // Selection Sort
    // This algorithm divides the array into a sorted and unsorted part. It selects the smallest element from the unsorted part and swaps it with the first element of the unsorted part.
    void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        System.out.println("Array after Selection Sort:");
        printArray(arr);
    }

    // Insertion Sort
    // This algorithm divides the array into a sorted and unsorted part. It iteratively takes elements from the unsorted part and inserts them into the correct position in the sorted part.
    void insertion_sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
        System.out.println("Array after Insertion Sort:");
        printArray(arr);
    } 

    // Method to print the array
    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Swap method
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {14, 9, 15, 12, 6, 8, 13};
        int n = arr.length;
        Sorting sorting = new Sorting();

        System.out.println("Original Array:");
        sorting.printArray(arr);

        int[] arr1 = arr.clone();
        sorting.insertion_sort(arr1, n);

        int[] arr2 = arr.clone();
        sorting.bubble_sort(arr2, n);

        int[] arr3 = arr.clone();
        sorting.selection_sort(arr3, n);
    }
}
