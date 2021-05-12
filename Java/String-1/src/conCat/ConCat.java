package conCat;

public class ConCat {
    //Retorne uma String que seja a concatenação das String "a" e "b", porém caso a concatenação resulte em uma String
    //de Chars duplicados então elimine um deles. (Ex.: ("Cat","table") -> "Catable").

    public String conCat(String a, String b) {
        if (a.length() * b.length() == 0 || !(a.charAt(a.length()-1) == b.charAt(0))){
            return a + b;
        } else return a + b.substring(1);
    }
}
