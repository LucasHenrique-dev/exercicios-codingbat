package fix45;

import java.util.Arrays;

public class Fix45 {
    //Retorne um Array numérico de mesmo tamanho que o Array dado ("nums") de modo que em toda ocorrência do número 4 seia
    //seguida pelo número 5 (o Array terá a mesma quantidade de 4 e 5), ou seia a posição do 4 se manterá e o 5 deverá ser
    //realocado imediatamente para a sua frente. Toda aparição de 4 terá um número a sua frente que não será o 4 e o 5
    //poderá aparecer em qualquer lugar do Array dado.
    //Ex.:(([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]; ([1, 4, 1, 5]) → [1, 4, 5, 1]; ([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]).

    public int[] fix45(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                result[i] = 4;
                result[i+1] = 5;
            }
        }
        for (int n : nums) {
            String str = Arrays.toString(result).replace(" ", "");
            int find_0 = str.indexOf("0")/2;
            if (n != 4 && n != 5) result[find_0] = n;
        }
        return result;
    }
}
