package less20;

public class Less20 {
    //Retorne true se o número não negativo dado for 1 ou 2 unidades menor que um múltiplo de 20.

    public boolean less20(int n) {
        return (n % 20 == 19 || n % 20 == 18);
    }
}
