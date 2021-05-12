package extraEnd;

public class ExtraEnd {
    //Retorne um String que seja a repetição, 3 vezes, das últimas duas letras da String dada. O tamanho da String dada
    //tem que ser pelo menos 2.

    public String extraEnd(String str) {
        String fim = str.substring(str.length()-2);
        return fim + fim + fim;
    }
}
