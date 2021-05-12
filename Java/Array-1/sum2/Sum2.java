package sum2;

public class Sum2 {
    //Retorne a soma dos 2 primeiros elementos de um Array, se ele tiver menos que isso, retorne o que ouver e caso seu
    //"length" seja 0, retorne 0.

    public int sum2(int[] nums) {
        int sum = 0, tam = 2;
        if (nums.length < 2) tam = nums.length;
        for (int i = 0; i < tam; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
