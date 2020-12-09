package linearIn;

public class LinearIn {
    //Retorne true se todos os elementos do Array numérico dado ("inner"), estiverem presente no Array numérico dado ("outer").
    //Os Arrays já estarão ordenados e a melhor solução será fazendo em uma única checagem "linear" nos dois Arrays.

    public boolean linearIn(int[] outer, int[] inner) {
        int cont = 0, i = 0;
        for (int value : outer) {
            if (cont == inner.length) return true;
            else if (i >= inner.length) break;
            else if (value == inner[i]) {
                cont++;
                i++;
            }
        }
        return (cont == inner.length);
    }
}
