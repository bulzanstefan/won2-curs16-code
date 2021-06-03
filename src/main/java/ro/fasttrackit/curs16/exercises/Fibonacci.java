package ro.fasttrackit.curs16.exercises;

public class Fibonacci {
    public int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("please provide n>0");
        }
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
