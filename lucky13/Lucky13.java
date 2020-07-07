package lucky13;

public class Lucky13 {
    //Retorne true se no Array de números dado ("nums") não contiver um "1" ou um "3".

    public boolean lucky13(int[] nums) {
        for (int n :
                nums) {
            if (n == 1 || n == 3) return false;
        }
        return true;
    }
}
