package array220;

public class Array220 {
    //Dado um Array numérico "nums" e um index (valor 0), retorne true se dentre os valores que o Array possui há um
    //seguido por ele mesmo vezes 10. Fazer recursivamente.
    //Ex.:(([1, 2, 20], 0) → true; ([3], 0) → false; ([3, 30], 0) → true).

    public boolean array220(int[] nums, int index) {
        if (index >= nums.length-1) return false;
        int val1 = nums[index], val2 = nums[index+1];
        if (val1*10 == val2) return true;
        return array220(nums, index+1);
    }
}
