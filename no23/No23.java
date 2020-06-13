package no23;

public class No23 {
    //Dado um Array de "length" 2, retorne true se ele não tiver 2 ou 3, caso contrário false.

    public boolean no23(int[] nums) {
        for (int n :
                nums) {
            if (n == 2 || n == 3) return false;
        }
        return true;
    }
}
