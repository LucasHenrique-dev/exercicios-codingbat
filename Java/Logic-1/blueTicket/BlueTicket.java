package blueTicket;

public class BlueTicket {
    //Dados os inteiros "a", "b", e "c" retorne os seguintes valores de acordo com cada condição e sabendo que
    //os 3 números dados formam 3 somas diferentes então:
    //10: se caso alguma soma dê 10
    //5: caso a soma "a+b" seja exatamente maior que "a+c" ou "b+c" em exatamente 10 unidades
    //0: caso não obedeça nenhum dos casos anteriores


    public int blueTicket(int a, int b, int c) {
        int soma1 = a+b, soma2 = a+c, soma3 = b+c;
        if (soma1 == 10 || soma2 == 10 || soma3 == 10) return 10;
        if (soma1 == soma2+10 || soma1 == soma3+10) return 5;
        else return 0;
    }
}
