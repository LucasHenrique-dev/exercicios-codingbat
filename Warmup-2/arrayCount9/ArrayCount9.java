package arrayCount9;

public class ArrayCount9 {
    //Retorne o número de 9's que possui o Array.

    public int arrayCount9(int[] nums) {
        int cont = 0;
        for (int n :
                nums) {
            if (n == 9) cont++;
        }
        return cont;
    }
}
