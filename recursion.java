import java.util.Arrays;

public class recursion {

    // Method to print a name number of times
    public static void printName(int i, int n) {
        if (i > n)
            return;
        System.out.println("Name: ");
        printName(i + 1, n);
    }

    // Method to print 1-N
    public static void print1ToN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print1ToN(i + 1, n);
    }

    // method to print N to 1
    public static void printNTo1(int i, int n) {
        if (n < i) {
            return;
        }
        System.out.println(n);
        printNTo1(i, n - 1);
    }

    // method to print sum
    public static void printSum(int n, int sum) {

        if (n == 0) {
            System.out.println(sum);
            return;
        }
        printSum(n - 1, sum + n);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static int[] reverseArray(int[] arr, int l, int r) {
        if (l >= r) {
            return arr;
        }
        swap(arr, l, r);
        reverseArray(arr, l + 1, r - 1);
        return arr;
    }

    public static boolean palindrome(String str, int l) {
        int r = str.length() - l - 1;
        if (l >= r) {
            return true;
        }

        if (str.charAt(l) != str.charAt(r)) {
            return false;
        }

        return palindrome(str, l + 1);
    }

    public static void main(String args[]) {
        recursion r = new recursion();
        int[] arr = { 1, 2, 3, 4, 5 };
        String str = "MadaM";
        r.printName(0, 5);
        r.print1ToN(0, 5);
        r.printNTo1(0, 5);
        r.printSum(5, 0);
        System.out.println(r.factorial(5));
        System.out.println(Arrays.toString(r.reverseArray(arr, 0, arr.length - 1)));
        if (r.palindrome(str, 0)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a plaindrome");
        }
    }
}
