package withoutTen;

public class WithoutTen {
    //Retorne um Array numérico onde todas as ocorrências do número "10" no Array dado ("nums"), são substituídas por "0"
    //e recolocadas ao fim do Array. Os elementos que sobraram devem ser movidos uma casa para a esquerda.
    //Ex.:(([1, 10, 10, 2]) → [1, 2, 0, 0]; ([10, 2, 10]) → [2, 0, 0]).

    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length]; //QUANDO INICIALIZADDO, TODAS AS POSIÇÕES SÃO ZERO.
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 10) result[j++] = nums[i];
        }
        return result;
    }
}
