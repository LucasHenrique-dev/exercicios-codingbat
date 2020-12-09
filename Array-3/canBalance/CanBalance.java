package canBalance;

public class CanBalance {
    //Retorne true se no Array dado ("nums") há a possibilidade de dividirmos em duas partes que possuirão a mesma soma
    //em cada lado.
    //Ex.:(([1, 1, 1, 2, 1]) → true; ([2, 1, 1, 2, 1]) → false; ([10, 10]) → true).

    public boolean canBalance(int[] nums) {
        int soma_aux1 = 0, soma_aux2 = 0, cont = 0;
        boolean tranca = false;
        for (int i = 1; i < nums.length; i++){
            if (!tranca) {
                soma_aux1 += nums[i - 1];
                tranca = true;
            }
            soma_aux2 += nums[i];
            if (cont < nums.length-1 && i == nums.length-1){
                cont++;
                if (soma_aux1 == soma_aux2) return true;
                else {
                    tranca = false;
                    soma_aux2 = 0;
                    i = cont;
                }
            }
        }
        return false;
    }
}
