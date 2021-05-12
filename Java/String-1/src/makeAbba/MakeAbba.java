package makeAbba;

public class MakeAbba {
    //Dada as Strings a e b então retorne abba. (Ex.: ("hi","bye") -> "hibyebyehi").

    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }
}
