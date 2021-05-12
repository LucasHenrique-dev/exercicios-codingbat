package userCompare;

public class UserCompare {
    //Dado um par de informações (String e int), ordene-os primeiramente pelo nome, se ambos forem iguais use o número
    //como critério de desempate. Então retorne 1 caso "A" (par de String e int pertencentes a "A") venha depois de "B"
    //(par de String e int pertencentes a "B"), -1 se vier antes e 0 caso ambos sejam iguais.
    //Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is
    //ordered to str2 (the value is not limited to -1/0/1).

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) return -1;
        else if (aName.compareTo(bName) > 0) return 1;
        else {
            if (aId - bId < 0) return -1;
            else if (aId - bId > 0) return 1;
        }
       return 0;
    }
}
