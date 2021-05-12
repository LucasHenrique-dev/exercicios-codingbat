package oneTwo;

public class OneTwo {
    //Retorne uma String que a cada grupo de 3 caracteres, mova o seu primeiro para a última posição (do mesmo grupo).
    //Ignore qualquer grupo com menos de 3 caracteres no fim da String. Ex.:(("abc") → "bca"; ("tcagdo") → "catdog").

    public String oneTwo(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int tamanho = str.length() - str.length() % 3;
        for (int i = 0; i < tamanho; i += 3) {
            String two = str.substring(i+1,i+3);
            stringBuilder.append(two);
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
