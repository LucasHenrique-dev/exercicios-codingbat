package shareDigit;

public class ShareDigit {
    //Dados 2 números dentro do intervalo de 10 a 99, retorne true se ambos compratilharem um dígito em comum.
    //Ex.: ((12,21) -> true).

    public boolean shareDigit(int a, int b) {
        return (a/10 == b%10 || a%10 == b/10 || a/10 == b/10 || b%10 == a%10);
    }
}
