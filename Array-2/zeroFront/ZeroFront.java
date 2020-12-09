package zeroFront;

public class ZeroFront {
    //Retorne uma Array numérico em que todas as ocorrências do número "0" do Array dado ("nums") estejão no início desse
    //novo Array. A regras para os outros números não importa, só que os "0" devem estra no início.

    public int[] zeroFront(int[] nums) {
        int[] ints = new int[nums.length];
        for (int i = 0, j = nums.length-1; i < nums.length; i++) {
            int ultimoVal = nums.length - (1+j), primeiroVal = i - ultimoVal;
            if (nums[i] != 0) ints[j--] = nums[i];
            else ints[primeiroVal] = nums[i];
        }
        return ints;
    }

    //MALABARES COM AS POSIÇÕES
    public int[] zeroFront_2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[count];
                nums[count] = 0;
                count++;
            }
        }
        return nums;
    }
}
