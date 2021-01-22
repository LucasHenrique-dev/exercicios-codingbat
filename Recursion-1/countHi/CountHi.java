package countHi;

public class CountHi {
    //Dado uma String "str", retorne o número de vezes que aparece a String "hi". Fazer recursivamente e sem loopings.

    public int countHi(String str) {
        int cont = 0, tamanho = str.length();
        if (tamanho > 2) cont = countHi(str.substring(0,tamanho-1));
        if (tamanho - 2 < 0) return cont;
        else if (str.substring(tamanho-2).equals("hi")) cont++;
        return cont;
    }

    //FORMA SIMPLIFICADA
    public int countHi_2(String str) {
        if (str.length() <= 1) return 0;
        int count = 0;
        if (str.substring(0, 2).equals("hi")) count = 1;  // could use startsWith()
        return count + countHi_2(str.substring(1));
    }

}
