package sum28;

public class Sum28 {
    //Retorne true se a soma de todos os números "2" contidos no Array dado ("nums") der exatamente 8.

    public boolean sum28(int[] nums) {
        int count = 0;
        for (int n :
                nums) {
            if (n == 2) count += n;
        }
        return count == 8;
    }
}
