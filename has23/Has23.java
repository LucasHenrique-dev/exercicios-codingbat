package has23;

public class Has23 {
    //Dado um Array de "length" 2, retorne true se ele tiver um 2 ou um 3.

    public boolean has23(int[] nums) {
        for (int n :
                nums) {
            if (n == 2 || n == 3) return true;
        }
        return false;
    }
}
