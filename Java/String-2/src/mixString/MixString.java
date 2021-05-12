package mixString;

public class MixString {
    //Dada as Strings "a" e "b" retorne uma String formada da seguinte forma: a primeira letra de "a", depois a primeira
    //de "b", a segunda de "a", depois a segunda de "b" e assim por diante. Até que todas as letras das duas palavras
    //sejam usadas.

    public String mixString(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int tamanho = Math.max(a.length(),b.length());
        for (int i = 0; i < tamanho; i++) {
            if(i < a.length()) {
                stringBuilder.append(a.charAt(i));
            }
            if (i < b.length()) {
                stringBuilder.append(b.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
