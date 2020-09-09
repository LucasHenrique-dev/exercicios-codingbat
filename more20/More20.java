package more20;

public class More20 {
    //Retorne true se o número não negativo dado for 1 ou 2 unidades maior que um múltiplo de 20.

    public boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }
}
