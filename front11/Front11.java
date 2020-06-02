package front11;

public class Front11 {
    //Retorne um Array que contenha o 1° elemneto de cada Array dado, se o "length" for zero, ignore-o.

    public int[] front11(int[] a, int[] b) {
        int[] array = new int[0];
        if (a.length + b.length == 0) return array;
        else if (a.length == 0) return array = new int[]{b[0]};
        else if (b.length == 0) return array = new int[]{a[0]};
        else return array = new int[]{a[0],b[0]};
    }
}
