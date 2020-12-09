package squareUp;

public class SquareUp {
    //Dado um número "n" (maior ou igual a zero) retorne um Array numérico de dimensão n*n, seguindo o seguinte padrão:
    //n -> 3: [0, 0, 1, 0, 2, 1, 3, 2, 1]
    //n -> 2: [0, 1, 2, 1]
    //n -> [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

    public int[] squareUp(int n) {
        int[] result = new int[n*n];
        int cont = 0;
        for (int i = 0, j = n; i < n * n; i++) {
            result[result.length-(1+i)] = ++cont;
            if (cont == j){
                i += n - j;
                j--;
                cont = 0;
            }
        }
        return result;
    }
}
