package repeatFront;

public class RepeatFront {
    //Retorne uma String que seja os primeiros "n" dígitos da String dada, "n" vezes de modo que a cada repetição será
    //adicionado com um dígito a menos "n-1". "n" estará compreendido entre 0 e o "length" da String dada. Onde 0 é o
    //primeiro dígito, 1 o segundo e assim por diante. Ex.:(("Chocolate", 4) → "ChocChoChC"; ("Chocolate", 3) → "ChoChC").

    public String repeatFront(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i < n; i++){
            stringBuilder.append(str.substring(0,n-i));
        }
        return stringBuilder.toString();
    }
}
