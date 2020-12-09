package fizzArray2;

public class FizzArray2 {
    //Dado um número inteiro "n", retorne um Array de Strings cujo tamanho seja equivalente ao "n", com os seus elementos
    //seguindo a sequência: "0", "1", "2", "3", "4"... "n-1". Caso "n" seja 0, apenas retorne "0".

    public String[] fizzArray2(int n) {
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = String.valueOf(i);
        }
        return strings;
    }
}
