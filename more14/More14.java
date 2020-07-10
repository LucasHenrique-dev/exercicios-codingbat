package more14;

public class More14 {
    //Retorne true se o número de "1", dentro do Array dado ("nums"), superar o número de "4".

    public boolean more14(int[] nums) {
        int cont_1 = 0, cont_4 = cont_1;
        for (int n :
                nums) {
            if (n == 1) cont_1 += 1;
            else if (n == 4) cont_4 += 1;
        }
        return cont_1 > cont_4;
    }
}
