package org.example.Lesson4;

public class Lesson4 {

    public static void main(String[] args) throws Exception {
        int n = 7;
        System.out.println(progression(n));
        System.out.println(progression2(n));
        System.out.println(fibonacci(n));
        System.out.println(fibonacci2(n));
    }
    // O(n)
    public static int progression(int n) throws Exception {
        if (n <= 0)
            throw new Exception("The number should positive");
        if (n == 1) return 1;
        return progression(n - 1) + n;
    }
    // O(n)
    public static int progression2(int n) throws Exception {
        if (n <= 0)
            throw new Exception("The number should positive");
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;

    }
    //  O(2^n)
    public static int fibonacci(int n) throws Exception {
        if (n <= 0)
            throw new Exception("The number should positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonacci(n -1) + fibonacci(n - 2);

    }

    public static int fibonacci2(int n) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 1;
        for (int i = 3; i <= n; i++) {
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
        }
        return sum;
    }
}
