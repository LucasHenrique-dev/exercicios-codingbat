package haveThree;

public class HaveThree {
    //Retorne true se no Array numérico dado ("nums") houver exatamente três "3" e que nenhum esteja do lado do outro.

    public boolean haveThree(int[] nums) {
        if (nums.length == 0) return false;
        int cont_3 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i+1] != 3) cont_3++;
        }
        if (nums[nums.length-1] == 3) cont_3++;
        return cont_3 == 3;
    }
}
