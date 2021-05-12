package fibonacci;

public class Fibonacci {
    //Dado um número "n", retorne o n-ésimo termo da seqência de Fibonacci, sendo o primeiro retratado como 0.
    //Fibonacci sequência: 0, 1, 1, 2, 3, 5, 8, 13, 21. Retorne o resultado recursivamente.

    public int fibonacci(int n) {
        int fib = 0;
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        fib = fibonacci(n-1) + fibonacci(n-2);
        return fib;
    }
}
