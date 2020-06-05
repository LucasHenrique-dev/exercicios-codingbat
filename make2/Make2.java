package make2;

public class Make2 {
    //Retorne um Array de "length" 2 que possua os elementos dos outros 2 originais, o tanto que ele puder. O "length"
    //dos originais pode ser qualquer um, contanto que ambos juntos possuam 2 ou mais elemntos. (Ex.: ([1],[2,3,4]) -> [1,2]).

    public int[] make2(int[] a, int[] b) {
        int[] array = new int[2];
        int cont = 0;
        for (int i = 0; i < a.length + b.length; i++) {
            if (i >= a.length) array[i] = b[i-a.length];
            else array[i] = a[i];
            cont++;
            if (cont == 2) break;
        }
        return array;
    }
}
