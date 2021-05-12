package hasBad;

public class HasBad {
    //Retorne true se "bad" aparecer na String apartir do index 0 ou 1, caso não false.

    public boolean hasBad(String str) {
        if (str.length() <= 3 && !str.contains("bad")) return false;
        return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
    }

    //Maneira interessante, porém é mais lenta... Mas interessante.
    public boolean hasBad_2(String str){
        return str.indexOf("bad") == 0 || str.indexOf("bad") == 1;
    }
}
