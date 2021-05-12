package prefixAgain;

public class PrefixAgain {
    //Retorne true caso o prefixo ("n" primeiras letras) da String dada se repete na String. Considere um String não nula
    //e "n" compreendido entre 1 e "length" da String, inclusive. Caso a condição seja falsa, retorne false.

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n);
        int tamanho = str.length();
        for (int i = prefix.length(); i < tamanho; i++) {
            if (str.startsWith(prefix,i)) return true;
        }
        return false;
    }
}
