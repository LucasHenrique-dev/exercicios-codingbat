package noTriples;

public class NoTriples {
    //Retorne true se no array tiver uma sequência de 3 números iguais, caso contrário false.

    public boolean noTriples(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                result = false;
                break;
            }
        }
        return result;
    }
}
