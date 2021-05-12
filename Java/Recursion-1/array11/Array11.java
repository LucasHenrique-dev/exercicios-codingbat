package array11;

public class Array11 {
    //Dado um Array numérico "nums" e um "index" (valor 0), retorne o número de vezes em que o "11" aparece no Array dado.
    //Fazer recursivamente.

    public int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        if (nums[index] == 11) return array11(nums, index+1) + 1;
        return array11(nums,index+1);
    }
}
