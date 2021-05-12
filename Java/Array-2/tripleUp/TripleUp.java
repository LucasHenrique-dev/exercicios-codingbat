package tripleUp;

public class TripleUp {
    //Retorne true se no Array numérico dado ("nums") houver uma sequência de três números crescentes, como: 1,2,3 ou
    //43,44,45.

    public boolean tripleUp(int[] nums) {
        if (nums.length <= 2) return false;
        for (int i = 1; i < nums.length-1; i++) {
            int ini = nums[i-1], meio = nums[i], fim = nums[i+1];
            if (ini == meio-1 && ini == fim-2) return true;
        }
        return false;
    }
}
