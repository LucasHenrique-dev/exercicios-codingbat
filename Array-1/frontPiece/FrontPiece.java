package frontPiece;

public class FrontPiece {
    //Retorne um Array que possua os 2 primeiros elementos, ou o que for que tenha até lá, do Array original.

    public int[] frontPiece(int[] nums) {
        int tam = 2;
        if (tam > nums.length) tam = nums.length;
        int[] num = new int[tam];
        for (int i = 0; i < tam; i++) {
            num[i] = nums[i];
        }
        return num;
    }

    //JEITO MAIS LEGAL
    public int[] frontPiece_2(int[] nums) {
        int tam = 2;
        if (tam > nums.length) tam = nums.length;
        int[] num = new int[tam];
        System.arraycopy(nums, 0, num, 0, tam);
        return num;
    }
}
