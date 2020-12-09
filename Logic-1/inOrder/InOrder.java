package inOrder;

public class InOrder {
    //Retorne true se "b" for maior que "a" e "c" for maior que "b". Porém, se "bOK" for true "b" não precisará ser maior
    //que "a" para retornar true. Em outros casos, retorne false.

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk) return (b > a) && (c > b);
        else return c > b;
    }
}
