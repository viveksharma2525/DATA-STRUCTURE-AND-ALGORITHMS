class FibonacciSeries {
    public int fibonacci(int n) {
        int[] fib = new int[n + 1];

        // Base cases
        if (n <= 1) {
            return n;
        }

        // Compute Fibonacci using memoization
        if (fib[n] == 0 && n > 1) { 
            fib[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return fib[n];
    }

    public static void main(String[] args) {
        FibonacciSeries print = new FibonacciSeries();
        int n = 3;
        int res = print.fibonacci(n);
        System.out.println(res); // Output will be 2
    }
}
