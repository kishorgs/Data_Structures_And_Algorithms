public class ArrayOperations1 {
    // Method to find the maximum element
    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the second maximum element
    public static int findSecondMax(int[] arr) {
        int max = 0, second_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            }
        }
        return second_max;
    }

    // Method to find the index of the maximum element
    public static int findMaxIndex(int[] arr) {
        int max = 0;
        int maxIndex = -1; // Initialize with -1 to handle empty arrays (optional safety)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 2, 8, 9, 3};
        
        System.out.println("Maximum element: " + findMax(arr));
        System.out.println("Second maximum element: " + findSecondMax(arr));
        System.out.println("Index of maximum element: " + findMaxIndex(arr));
    }
}
