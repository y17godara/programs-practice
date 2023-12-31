public class RecursionBasics {

    // function: get factorial of a number
    public static int getFactorial(int n) {
        if (n > 1)
            return n * getFactorial(n - 1);
        else
            return 1;
    }

    // function: get sum of first x natural numbers
    public static int getSumOfXNaturalNumber(int x) {
        if (x > 1) {
            return x + getSumOfXNaturalNumber(x - 1);
        } else {
            return 1;
        }
    }

    // function: get fabonacci of a number
    public static int fabonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int fib1 = fabonacci(n - 1);
        int fib2 = fabonacci(n - 2);
        int fib = fib1 + fib2;
        return fib;
    }

    // function: check if array is sorted
    public static boolean isArraySorted(int arr[], int index) {

        if (arr.length - 1 == index) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isArraySorted(arr, index + 1);
    }

    // function: get first occurance of a number in array
    public static int firstOccurance(int arr[], int index, int num) {
        if (arr.length == index) {
            return -1;
        }

        if (arr[index] == num) {
            return index;
        }
        return firstOccurance(arr, index + 1, num);
    }

    // function: get last occurance of a number in array
    public static int lastOccurance(int[] arr, int index, int num) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == num) {
            return index;
        }

        return lastOccurance(arr, index - 1, num);
    }

    // function: print x to the power n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    // function: optimized x to the power n
    public static int optPower(int num, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = optPower(num, n / 2) * optPower(num, n / 2);

        // if n is odd
        if (n % 2 != 0) {
            halfPower = num * halfPower;
        }

        return halfPower;
    }

    // main
    public static void main(String args[]) {

        // int num = 26;
        // System.out.println(getFactorial(num));
        // System.out.println(getSumOfXNaturalNumber(num));
        // System.out.println(fabonacci(num));

        // int arr[] = { 2, 4, 6, 8, 8 };
        // boolean isSorted = isArraySorted(arr, 0);
        // System.out.println(isSorted);
        // System.out.println(firstOccurance(arr, 0, 8));
        // System.out.println(lastOccurance(arr, 4, 1));

        int n = 5;
        // System.out.println(power(n, 3));
        System.out.println(optPower(n, 3));

    }
}