package bigDiff;

public class BigDiff {
    //Retorne a diferença entre o maior e o menor número do Array dado ("nums").

    public int bigDiff(int[] nums) {
        int maior = nums[0], menor = maior;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maior) maior = nums[i];
            if (nums[i] < menor) menor = nums[i];
        }
        return maior - menor;
    }
}
