package double23;

public class Double23 {
    //Retorne true se no Array houver o 2 duas vezes ou o 3 duas vezes, o "length" do Array será 0, 1 ou 2.

    public boolean double23(int[] nums) {
        int cont3 = 0, cont2 = 0;
        for (int n :
                nums) {
            if (n == 2) cont2++;
            if (n == 3) cont3++;
            if (cont2 == 2 || cont3 == 2) return true;
        }
        return false;
    }
}
