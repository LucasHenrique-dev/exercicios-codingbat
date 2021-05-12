package copyEvens;

public class CopyEvens {
    //Dado um Array numérico ("nums") e um inteiro "count" retorne um outro Array numérico que possua como valores a quantidade
    //de números pares indicados por "count", tudo em referência ao Array dado. "nums" terá a quantidade de números pares
    //igual ou maior a "count".
    //Ex.:(([3, 2, 4, 5, 8], 2) → [2, 4]; ([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]; ([3, 2, 4, 5, 8], 3) → [2, 4, 8]).

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (nums[i] % 2 == 0) result[j++] = nums[i];
        }
        return result;
    }
}
