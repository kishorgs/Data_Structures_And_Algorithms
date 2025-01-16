class Solution {
    
    // Method 1: Using brute force to find the single number
    public int singleNumberBruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return -1;
    }
    
    // Method 2: Using XOR to find the single number
    public int singleNumberXOR(int[] nums) {
        int res = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    // Main method to test both approaches
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test array
        int[] nums = {4, 1, 2, 1, 2};
        
        // Testing brute-force approach
        System.out.println("Single number (Brute Force): " + solution.singleNumberBruteForce(nums));
        
        // Testing XOR approach
        System.out.println("Single number (XOR): " + solution.singleNumberXOR(nums));
    }
}
