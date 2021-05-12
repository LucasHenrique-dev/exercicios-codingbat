package repeatSeparator;

public class RepeatSeparator {
    //Retorne uma String que seja a repetição "count" vezes da String "word", onde cada repetição deverá ser separada
    //pela String "sep".

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(word);
            if (i < count-1) {
                stringBuilder.append(sep);
            }
        }
        return stringBuilder.toString();
    }
}
