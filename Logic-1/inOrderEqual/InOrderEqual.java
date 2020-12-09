package inOrderEqual;

public class InOrderEqual {
    //Retorne true se os inteiros dados estiverem estritamente em ordem crescente, em ordem dada, porém, se "equalOK" for
    //true, será permitido que sequência com números repetidos retornem true, caso não retorne false.
    //Ex.: ((1,2,2,false) -> false; (4,4,4,true) -> true).

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) return (b >= a) && (c >= b);
        else return (b > a) && (c > b);
    }
}
