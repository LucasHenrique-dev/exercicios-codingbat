package only14;

public class Only14 {
    //Retorne true se todos os elementos do Array dado ("nums") forem "1" ou "4".

    public boolean only14(int[] nums) {
        for (int n :
                nums) {
            if (n != 1 && n != 4) return false;
        }
        return true;
    }
}
