package org.example.Lesson3;

public class Recursion {
    public static void main(String[] args) throws Exception {
        //System.out.println(progression(5));
        //System.out.println(progressionRecursion(5));
        //System.out.println(fibonacci(5));
        //System.out.println(fibonacciRecursion(5));
        //System.out.println(factar(5));
        //System.out.println(factarRecursion(5));
        System.out.println(factarPlus(5));
        System.out.println(factarPlusRecursion(5));

    }
    public static int progression(int n) {
        if ( n <= 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
           sum = sum + i;
        }
        return sum;
    }
    public static int progressionRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return progressionRecursion(n -1) + n;
    }
    public static int fibonacci(int n) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        int sum1 = 0;
        int sum2 = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
        }
        return sum;
    }
    public static int fibonacciRecursion(int n) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;

        return progression(n - 1) + progression(n - 2);
    }
    public static int factar(int n) {
        if ( n <= 0) {
            return 0;
        }
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum  * i;
        }
        return sum;

    }
    public static int factarRecursion(int n) {
        if ( n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 2;
        }

        return factarRecursion(n - 1) * n;

    }
    public static int factarPlus(int n) {
        if ( n <= 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum  + i * 2 ;
        }
        return sum;
    }
    public static int factarPlusRecursion(int n) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        if (n == 1) return 2;
        return factarPlusRecursion(n - 1) + n * 2;
    }
}
