package makeOutWord;

public class MakeOutWord {
    //Dada um String "out" (EX.: "<<>>", "[[]]") e uma "word", retorne uma String do tipo <<"word">>.

    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
    }
}
