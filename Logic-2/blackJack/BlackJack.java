package blackJack;

public class BlackJack {
    //Dados 2 números inteiros maiores que 0, retorne o que for mais próximo de 21, porém que seja igual ou abaixo. Caso
    //ambos os valores forem maiores retorne 0.

    public int blackjack(int a, int b) {
        int result, aDif = a-21, bDif= b-21;
        if (Math.max(aDif,bDif) <= 0){
            result = Math.max(aDif,bDif)+21;
        } else result = Math.min(aDif,bDif)+21;
        if (result > 21) return 0;
        else return result;
    }

    //UM JEITO MAIS SIMPLES E ELEGANTE
    public int blackjack_2(int a, int b) {
        // The value of a/b, or 0 if over 21
        int aVal = a;
        if (aVal > 21) {
            aVal = 0;
        }
        int bVal = b;
        if (bVal > 21) {
            bVal = 0;
        }

        // Now it works to just return whichever is larger.
        if (aVal > bVal) {
            return aVal;
        }
        else {
            return bVal;
        }

        // You can write a very short version of this same strategy
        // using the "ternary operator" ?: and Math.max()
    }
}
