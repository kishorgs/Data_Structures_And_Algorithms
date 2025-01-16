import java.util.*;

public class MissingNumberSolution {

    // Method 1: Sorting approach
    // Time Complexity: O(n log n) (due to sorting)
    // Space Complexity: O(1)
    public int missingNumberUsingSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    // Method 2: HashSet approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int missingNumberUsingHashSet(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {
            hash.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!hash.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    // Method 3: Sum approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int missingNumberUsingSum(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    // Method 4: XOR approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int missingNumberUsingXOR(int[] nums, int N) {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 ^= nums[i]; // XOR of array elements
            xor1 ^= (i + 1); // XOR up to [1...N-1]
        }
        xor1 ^= N; // XOR up to [1...N]

        return xor1 ^ xor2; // The missing number
    }

    // Main method to test all approaches
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5}; // Example array
        int N = 5; // Total numbers from 1 to N

        MissingNumberSolution solution = new MissingNumberSolution();

        // Testing all methods
        System.out.println("Missing number using sorting: " + solution.missingNumberUsingSort(nums));
        System.out.println("Missing number using HashSet: " + solution.missingNumberUsingHashSet(nums));
        System.out.println("Missing number using sum formula: " + solution.missingNumberUsingSum(nums));
        System.out.println("Missing number using XOR: " + solution.missingNumberUsingXOR(nums, N));
    }
}
