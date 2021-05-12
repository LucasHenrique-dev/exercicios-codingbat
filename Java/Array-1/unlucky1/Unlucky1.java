package unlucky1;

public class Unlucky1 {
    //Se o "1" estiver vier seguido por um "3", dizemos que não teve sorte e retorna-se true, então retorne true se houver
    //um "1" não sortudo nas primeiras 2 casas ou nas 2 últimas.

    public boolean unlucky1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length > 1 && (i == 0 || i == 1 || i == nums.length-2) && (nums[i] == 1 && nums[i+1] == 3)){
                return true;
            }
        }
        return false;
    }
}
