package arrayFront9;

public class ArrayFront9 {
    //Retorna true se um dos 4 primeiros números do Array for 9, podendo o Array ter menos de 4 elementos.

    public boolean arrayFront9(int[] nums) {
        int size = 4;
        if (nums.length < 4){
            size = nums.length;
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }
}
