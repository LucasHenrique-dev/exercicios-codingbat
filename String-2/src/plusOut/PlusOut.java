package plusOut;

public class PlusOut {
    //Retorne uma String onde todos os caracteres presentes em "str" sejam substituídos por "+", exceto pelo caractere
    //representado por "word"."word" não será uma String vazia.

    public String plusOut(String str, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        int tamanho = word.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            String info;
            if (str.startsWith(word,i)){
                info = str.substring(i,(i+tamanho)+1);
                stringBuilder.append(info);
                i += tamanho;
            } else stringBuilder.append("+");
        }
        return stringBuilder.toString();
    }
}
