package array6;

public class Array6 {
    //Dado um Array de números "nums" e um "index" (valor 0), retorne true se no Array dado houver um "6". Fazer
    //recursivamente.

    public boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;
        if (nums[index] == 6) return true;
        return array6(nums, index+1);
    }
}
