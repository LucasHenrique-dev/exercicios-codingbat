package countX;

public class CountX {
    //Dado uma String "str", retorne o número de vezes que aparece o "x" em minúsculo, recursivamente e sem loopings.

    public int countX(String str) {
        int tamanho = str.length(), cont = 0;
        if (tamanho > 0) {
            cont = countX(str.substring(0, tamanho-1));
            if (str.charAt(tamanho-1) == 'x') cont++;
        }
        return cont;
    }
}
