package has12;

public class Has12 {
    //Retorne true se no Array dado ("nums") houver um "2" em algum lugar depois da aparição do "1".
    //Ex.:(([3, 1, 4, 5, 2]) → true).

    public boolean has12(int[] nums) {
        boolean has_1 = false, has_2 = false;
        for (int n:
             nums) {
            if (n == 1) has_1 = true;
            if (n == 2 && has_1) has_2 = true;
        }
        return has_1 && has_2;
    }
}
