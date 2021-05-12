package matchup;

public class Matchup {
    //Dado 2 Arrays de Strings, de mesmo tamanho, faça a comparação entre os sues primeiros valores, entre os segundos,
    //terceiros... e assim por diante, e retorne o número de pares que não forem vazios e que começem com a mesma letra.

    public int matchUp(String[] a, String[] b) {
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0))
                cont++;
        }
        return cont;
    }
}
