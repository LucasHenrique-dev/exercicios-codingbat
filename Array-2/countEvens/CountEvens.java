package countEvens;

public class CountEvens {
    //Retorne a quantidade de números paraes dentro do Array dado ("nums").

    public int countEvens(int[] nums) {
        int cont = 0;
        for (int n :
                nums) {
            if (n%2 == 0) cont++;
        }
        return cont;
    }
}
