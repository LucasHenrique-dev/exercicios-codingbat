package no14;

public class No14 {
    //Retorne true se não houver "1" ou se não houver "4" no Array de números dado ("nums").

    public boolean no14(int[] nums) {
        boolean has_4 = false, has_1 = false;
        for (int n:
             nums) {
            if (n == 4) has_4 = true;
            else if (n == 1) has_1 = true;
        }
        return !has_1 || !has_4;
    }
}
