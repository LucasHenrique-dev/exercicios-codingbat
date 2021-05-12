package commonEnd;

public class CommonEnd {
    //Retorne true se os começarem ou terminarem com os mesmos elementos, ambos devem ter um "length" maior ou igual a 1.

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }
}
