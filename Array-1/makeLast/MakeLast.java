package makeLast;

public class MakeLast {
    //Dado um Array, retorne um que tenha o dobro de tamanho e que cujo último número seja o mesmo do original,
    //sendo os demais 0. O "length" do Array dada deve ser de pelo menos 1 ou mais.
    //Nota: Na criaçao de um novo Arrays, todas as posições já iniciam sendo zero.

    public int[] makeLast(int[] nums) {
        int[] num = new int[nums.length*2];
        num[num.length-1] = nums[nums.length-1];
        return num;
    }
}
