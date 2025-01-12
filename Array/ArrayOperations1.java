public class Main {
    // Method to find the maximum element
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the second maximum element
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        return second_max;
    }

    // Method to find the index of the second maximum element
    public static int findMaxIndex(int[] arr) {
        int maxIndex = -1, secondMaxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (maxIndex == -1 || arr[i] > arr[maxIndex]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (secondMaxIndex == -1 || (arr[i] > arr[secondMaxIndex] && arr[i] != arr[maxIndex])) {
                secondMaxIndex = i;
            }
        }
        return secondMaxIndex;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 2, 8, 9, 3};
        
        System.out.println("Maximum element: " + findMax(arr));
        System.out.println("Second maximum element: " + findSecondMax(arr));
        System.out.println("Index of second maximum element: " + findMaxIndex(arr));
    }
}
