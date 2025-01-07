class Sorting {

    // Bubble Sort
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

    // Merge Sort
    void merge_sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            merge_sort(arr, low, mid);
            merge_sort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    // Merge Function for Merge Sort
    void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
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

        int[] arr4 = arr.clone();
        sorting.merge_sort(arr4, 0, n - 1);
        System.out.println("Array after Merge Sort:");
        sorting.printArray(arr4);
    }
}
