package matchUp;

public class MatchUp {
    //Retorne true se a diferença entre os números de mesmo index dos Arrays númericos dados ("nums1" e "nums2") forem de
    //2 ou menos, porém que não sejam iguais. Os dois Arrays terão o mesmo comprimento.

    public int matchUp(int[] nums1, int[] nums2) {
        int cont = 0;
        for (int i = 0; i < nums1.length; i++) {
            int dif = Math.abs(nums1[i]-nums2[i]);
            if (dif <= 2 && dif != 0) cont++;
        }
        return cont;
    }
}
