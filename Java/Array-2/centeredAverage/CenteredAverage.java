package centeredAverage;

public class CenteredAverage {
    //Retorne a média dos valores númericos do Array dado ("nums"), de modo que o maior e menor valores sejam ignorados.
    //Porém, se houver múltiplas cópias do maior e menor, ignore só uma cópia. O Array terá tamanho 3 ou mais.

    public int centeredAverage(int[] nums) {
        int maior = nums[0], menor = maior, soma = 0;
        for (int n :
                nums) {
            if (n > maior) maior = n;
            if (n < menor) menor = n;
            soma += n;
        }
        return (soma-(maior+menor))/(nums.length-2);
    }
}
