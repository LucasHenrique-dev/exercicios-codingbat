package startWord;

public class StartWord {
    //Dada uma String e uma "word", retorne a "frente" da String caso a "Word" coincida com o início da String, mesmo que a
    //primeira letra não seja exatamente igual, caso contrário retorne uma String vazia "".
    //(Ex.: "Hippo","xip") -> "hip"), a "word" tem que ter um "length" de pelo menos 1.

    public String startWord(String str, String word) {
        int tam = word.length();
        if (str.length() >= tam && str.substring(1,tam).equals(word.substring(1))){
            return str.substring(0, tam);
        } else return "";
    }
}
