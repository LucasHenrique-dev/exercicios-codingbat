package fix34;

import java.util.Arrays;

public class Fix34 {
    //Retorne um Array numérico de mesmo tamanho que o Array dado ("nums") de modo que em toda ocorrência do número 3 seia
    //seguida pelo número 4 (o Array terá a mesma quantidade de 3 e 4), ou seia a posição do 3 se manterá e o 4 deverá ser
    //realocado imediatamente para a sua frente. Toda aparição de 3 terá um número a sua frente que não será o 3 e o 4
    //só aparecerá depois do primeiro 3.
    //Ex.:(([1, 3, 1, 4]) → [1, 3, 4, 1]; ([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]; ([3, 2, 2, 4]) → [3, 4, 2, 2]).

    public int[] fix34(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                result[i] = 3;
                result[i+1] = 4;
            }
        }
        for (int n: nums) {
            String str = Arrays.toString(result).replace(" ", "");
            int find_0 = str.indexOf("0")/2;
            if (n != 3 && n != 4) result[find_0] = n;
        }
        return result;
    }
}
