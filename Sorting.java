public class Sorting {

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

    void merge(int[] arr, int low, int mid, int high) {
        int b[] = new int[high - low + 1];
        int n1 = low, n2 = mid + 1, x = 0;

        while (n1 <= mid && n2 <= high) {
            if (arr[n1] <= arr[n2]) {
                b[x++] = arr[n1++];
            } else {
                b[x++] = arr[n2++];
            }
        }
        while (n1 <= mid) {
            b[x++] = arr[n1++];
        }
        while (n2 <= high) {
            b[x++] = arr[n2++];
        }
        for (int i = 0, j = low; i < b.length; i++, j++) {
            arr[j] = b[i];
        }
    }

    // Quick Sort
    void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quick_sort(arr, low, pidx - 1);
            quick_sort(arr, pidx + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
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

        int[] arr5 = arr.clone();
        sorting.quick_sort(arr5, 0, n - 1);
        System.out.println("Array after Quick Sort:");
        sorting.printArray(arr5);
        
    }
}
