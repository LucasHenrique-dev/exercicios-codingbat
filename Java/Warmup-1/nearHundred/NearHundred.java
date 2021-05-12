package nearHundred;

public class NearHundred {
    //Retorne true se o número dado está 10 casas próximas de 100 ou 200.

    public boolean nearHundred(int n) {
        return (Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10);
    }
}
