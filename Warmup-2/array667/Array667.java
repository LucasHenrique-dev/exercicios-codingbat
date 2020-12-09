package array667;

public class Array667 {
    //Retornar a quantidade de vezes que há 2 6 juntos ou quando na verdade o 2° 6 for um 7.

    public int array667(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)){
                cont++;
            }
        }
        return cont;
    }
}
