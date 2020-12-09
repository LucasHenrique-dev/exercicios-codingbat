package sameEnds;

public class SameEnds {
    //Retorne true se no Array de números dado ("nums") possuir o final coincidindo com o inicio, sabendo que o limite é
    //determinado por "len", de modo que se "len" for 1 deverá se analisar o último e o primeiro, se 2 deverá se analisar
    //primeiro, segundo com último e penúltimo e assim por diante. "len' estará compreendido entre 0 e o "length" do Array.
    //Ex.:(([5, 6, 45, 99, 13, 5, 6], 2) → true; ([5, 6, 45, 99, 13, 5, 6], 1) → false; ([5, 6, 45, 99, 13, 5, 6], 3) → false).

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            int ini = nums[i], fim = nums[nums.length-(len-i)];
            if (ini != fim) return false;
        }
        return true;
    }
}
