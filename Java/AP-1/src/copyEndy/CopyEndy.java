package copyEndy;

public class CopyEndy {
    //Dito que um número é considerado "endy" quando estiver no intervalo entre 0..10 ou 90..100 (inclusive, para ambos)
    //e dado o Array numérico ("nums"), retorne outro Array numérico com tamanho "count" em que possuirá a quantidade de
    //números "endy" do Array "nums", determinado por "count". Faça um método auxiliar para verificar se o número é "endy".
    //Método auxiliar: isEndy(int n).
    //Ex.:(([9, 11, 90, 22, 6], 2) → [9, 90]; ([9, 11, 90, 22, 6], 3) → [9, 90, 6]; ([12, 1, 1, 13, 0, 20], 2) → [1, 1]).

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (isEndy(nums[i])) result[j++] = nums[i];
        }
        return result;
    }

    public boolean isEndy(int n){
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }
}
