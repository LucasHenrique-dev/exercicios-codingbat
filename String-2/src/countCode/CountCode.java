package countCode;

public class CountCode {
    //Retorne o número de vezes que a palavra "code" aparece na String dada, porém a letra "d" pode ser substituída por
    //qualquer uma, assim, valendo palavras como "core", "cofe" e "cowe".

    public int countCode(String str) {
        int cont = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co",i) && str.substring(i+3,i+4).equals("e")) cont++;
        }
        return cont;
    }
}
