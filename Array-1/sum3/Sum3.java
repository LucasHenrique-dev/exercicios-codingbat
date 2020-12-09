package sum3;

public class Sum3 {
    //Dado um Array de "length" 3, retorne a soma de todos os elementos.

    public int sum3(int[] nums) {
        int sum = 0;
        for (int n :
                nums) {
            sum += n;
        }
        return sum;
    }
}
