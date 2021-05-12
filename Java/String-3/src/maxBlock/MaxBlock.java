package maxBlock;

public class MaxBlock {
    //Retorne o tamanho do maior "bloco" que há na String dada ("str"), sabendo que um "bloco" é uma sequência de caracteres
    //repetidos. Ex.:(("abbCCCddBBBxx") → 3; ("") → 0).

    public int maxBlock(String str) {
        if (str.isEmpty()) return 0;
        int tamanho, max = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            char letra = str.charAt(i), letra1 = str.charAt(i+1);
            if (letra == letra1){
                if (stringBuilder.length() == 0){
                    stringBuilder.append(letra1);
                }
                stringBuilder.append(letra);
                tamanho = stringBuilder.length();
                if (tamanho > max) max = tamanho;
            } else {
                stringBuilder = new StringBuilder();
            }
        }
        return max;
    }
}
