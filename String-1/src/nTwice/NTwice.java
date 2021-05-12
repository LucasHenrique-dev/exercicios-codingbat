package nTwice;

public class NTwice {
    //Retorne um String com as n primeiras letras dadas e as últimas n letras, também, o "length" deverá ser pelo menos
    //de n, sendo n o parâmetro inteiro dado.

    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
    }
}
