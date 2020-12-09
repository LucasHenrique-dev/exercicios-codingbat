package seriesUp;

public class SeriesUp {
    //Dado um número "n" (maior ou igual a zero) retorne um Array numérico de dimensão (n*(n+1))/2 (soma de uma P.A.),
    //seguindo o seguinte padrão:
    //n -> 3: [1, 1, 2, 1, 2, 3]
    //n -> 4: [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
    //n -> 2: [1, 1, 2]

    public int[] seriesUp(int n) {
        int[] result = new int[n*(n+1)/2];
        int cont = n+1;
        for (int i = 0; i < result.length; i++) {
            result[result.length-(1+i)] = --cont;
            if (cont == 1){
                cont = (--n + 1);
            }
        }
        return result;
    }
}
