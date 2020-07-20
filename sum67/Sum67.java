package sum67;

import java.util.Arrays;

public class Sum67 {
    //Retorne a soma dos números contidos no Array dado ("nums"), entretanto não considere aqueles que estiverem entre o
    //6 e 7, inclusive, se houver. Ex.:(([1, 2, 2, 6, 99, 99, 7]) → 5; ([1, 1, 6, 7, 2]) → 4; ([1, 2, 2]) → 5).

    public int sum67(int[] nums) {
        boolean tranca = false;
        int cont = 0;
        for (int num : nums) {
            if (num == 6) tranca = true;
            if (!tranca) cont += num;
            if (num == 7) tranca = false;
        }
        return cont;
    }
}
