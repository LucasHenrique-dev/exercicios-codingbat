package nearTen;

public class NearTen {
    //Retorne true se o número não negativo dado estiver no intervalo de 2 unidades maior/menor que um múltiplo de 10.

    public boolean nearTen(int num) {
        return (num%10<=2 || num%10>=8);
    }
}
