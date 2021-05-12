package noX;

public class NoX {
    //Dado uma String "str", retorne uma nova onde todas as ocorrências de "x", sejam removidas.

    public String noX(String str) {
        if (str.length() < 1) return str;
        char c1 = str.charAt(0);
        if (c1 == 'x') return noX(str.substring(1));
        else return c1 + noX(str.substring(1));
    }
}
