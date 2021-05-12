package factorial;

public class Factorial {
    //Dado um número "n" maior ou igual a 1, retorne o seu fatorial, recursivamente. Sem loopings.

    public int factorial(int n) {
        if (n != 1) n *= (factorial(n-1));
        return n;
    }

    //UM JEITO MAIS EXPLICADO
    public int factorial_2(int n) {
        // Base case: if n is 1, we can return the answer directly
        if (n == 1) return 1;

        // Recursion: otherwise make a recursive call with n-1
        // (towards the base case), i.e. call factorial(n-1).
        // Assume the recursive call works correctly, and fix up
        // what it returns to make our result.
        return n * factorial(n-1);
    }
}
