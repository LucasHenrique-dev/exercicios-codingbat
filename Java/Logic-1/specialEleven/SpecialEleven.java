package specialEleven;

public class SpecialEleven {
    //Retorne true se "n" for múltiplo de 11 ou se for 1 número a mais que múltiplo. "n" será não negativo e deve-se usar
    //o "mod operator"-> % .

    public boolean specialEleven(int n) {
        return (n % 11 <= 1);
    }
}
