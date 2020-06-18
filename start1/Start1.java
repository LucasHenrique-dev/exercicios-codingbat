package start1;

public class Start1 {
    //Dado 2 Arrays de inteiros, de qualquer tamanho, retorne quantos deles tem o primeiro elemento valendo 1.

    public int start1(int[] a, int[] b) {
        int tam1 = 1, tam2 = 1, cont = 0;
        if (tam1 > a.length) tam1 = a.length;
        for (int i = 0; i < tam1; i++) {
            if (a[i] == 1) cont++;
        }
        if (tam2 > b.length) tam2 = b.length;
        for (int i = 0; i < tam2; i++) {
            if (b[i] == 1) cont++;
        }
        return cont;
    }

    //UM JEITO SIMPLES DE SE FAZER
    public int start1_2(int[] a, int[] b) {
        int count = 0;

        if(a.length > 0 && a[0] == 1)
            count++;

        if(b.length > 0 && b[0] == 1)
            count++;

        return count;
    }
}
