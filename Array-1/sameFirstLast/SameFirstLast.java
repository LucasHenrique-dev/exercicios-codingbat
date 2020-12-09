package sameFirstLast;

public class SameFirstLast {
    //Retorne true se o "length" do Array for maior ou igual a 1 e o último elemento coincide com o primeiro.

    public boolean sameFirstLast(int[] nums) {
        return nums.length >=1 && nums[0] == nums[nums.length-1];
    }
}
