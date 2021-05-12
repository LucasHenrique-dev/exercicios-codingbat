package makeTags;

public class MakeTags {
    //Dada a "tag" e a "word" então retorne a String como <"tag">"word"</"tag">.

    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }
}
