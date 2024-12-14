import java.math.*;

public class math {

    // Method to get GCD/HCF of 2 numbers
    public static void gcd() {
        int n = 9, m = 12, max = 0;

        // Brute force method (Complexity O(n))
        for (int i = 1; i < Math.min(n, m); i++) {
            if (m % i == 0 && n % i == 0) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println(max);
        

        // Average method (Complexity O(n/2))
        for (int i = 1; i <= Math.min(n, m) / 2; i++) {
            if (m % i == 0 && n % i == 0) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println(max);
        

        // Better solution (Complexity O(n/2))
        for (int i = Math.min(m, n); i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                max = i;
                break;
            }
        }

        System.out.println(max);

        // Best solution (Eucludian algorithm) (Complexity O(min(log(n,m)))
        while (m > 0 && n > 0) {
            if (m > n) {
                m = m % n;
            } else {
                n = n % m;
            }
            if (m == 0) {
                System.out.println(n);
            } else if (n == 0) {
                System.out.println(m);
            }
        }
    }

    // Method to check number is prime or not
    public static void isPrime() {
        int n = 11, count = 1;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        // Brute force approch
        // int n = 11, count = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
    }

    // Method to print all the divisors of a number
    public static void divisors() {
        int num = 36;
        int n = num;
        for (int i = 1; i <= num / 2; i++) {
            if ((num % i) == 0) {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }

    // Method to print armstrong number
    public static void armstrong() {
        int num = 371, result = 0;
        int test = num;
        while (num > 0) {
            int rem = num % 10;
            result += Math.pow(rem, 3);
            num /= 10;
        }
        if (test == result) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a Armstrong number");
        }

    }

    // Method to check palindrome or not
    public static void palindrome() {
        int num = 1234, test = 4321, rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == test) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    // Reverse a number
    public static void reverseNumber() {
        int num = 1234, rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        System.out.println(rev);
    }

    // Method to count number of digits (Advanced)
    public static void countDigits1() {
        int num = 18976;
        int count = (int) Math.log10(num) + 1;
        System.out.println(count);
    }

    // Method to count number of digits (brute force)
    public static void countDigits() {
        int num = 123456789, count = 0;

        while (num > 0) {
            int digit = num % 10;
            count++;
            num /= 10;

        }
        System.out.println(count);
    }

    // Method to extract all degits of a number
    public static void extractDigits() {
        int num = 12345;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            System.out.println(digit);
        }
    }

    public static void main(String args[]) {
        math m = new math();
        m.extractDigits();
        m.countDigits();
        m.countDigits1();
        m.reverseNumber();
        m.palindrome();
        m.armstrong();
        m.divisors();
        m.isPrime();
        m.gcd();
    }
}
