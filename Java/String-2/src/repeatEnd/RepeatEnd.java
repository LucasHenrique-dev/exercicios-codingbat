package repeatEnd;

public class RepeatEnd {
    //Retorne uma String que seja a repetição "n" vezes do final da String dada, onde a quantidade de letras que deverá
    //ser pega também é determinada por "n", ou seja, se "n" for 1, pegue o último, caso 2, pegue do penúltimo pro fim e
    //assim por diante. "n" varia de 0 até o "length" da String, inclusive.

    public String repeatEnd(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++){
            stringBuilder.append(str.substring(str.length()-n));
        }
        return stringBuilder.toString();
    }
}
