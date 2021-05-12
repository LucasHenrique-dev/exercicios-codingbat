package minCat;

public class MinCat {
    //Retorne a concatenação de duas Strings, se não possuírem o mesmo tamanho, diminua as letras para que assim tenham
    //e aí retorne a concatenação, as Strings podem ter qualquer tamanho. (Ex.: ("HELLO", "HI") -> "LOHI").

    public String minCat(String a, String b) {
        int dif = Math.abs(a.length() - b.length());
        return (a.length() >= b.length())? a.substring(dif) + b : a + b.substring(dif);
    }
}
