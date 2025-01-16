class Solution {
    // Method to rotate the array
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a part of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Method to remove duplicates from a sorted array
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    // Main method to test both functionalities
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Testing the rotate method
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Original array: ");
        printArray(nums1);
        solution.rotate(nums1, k);
        System.out.println("Array after rotation: ");
        printArray(nums1);

        // Testing the removeDuplicates method
        int[] nums2 = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println("Original sorted array: ");
        printArray(nums2);
        int length = solution.removeDuplicates(nums2);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    // Helper method to print an array
    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
