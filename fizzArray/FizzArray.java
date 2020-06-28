package fizzArray;

public class FizzArray {
    //Dado um número inteiro "n", retorne um Array de inteiros cujo tamanho seja equivalente ao "n", com seus os elementos
    //seguindo a sequência: 0, 1, 2, 3, 4... n-1. Caso "n" seja 0, apenas retorne 0.

    public int[] fizzArray(int n) {
        int[] sequencia = new int[n];
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = i;
        }
        return sequencia;
    }
}
