package withoutX2;

public class WithoutX2 {
    //Caso a String possua um "x" na primeira casa ou na segunda, retorne-a sem os respectivos, caso não retorne-a inalterada.

    public String withoutX2(String str) {
        if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(2);
        if (str.length() > 0 && str.charAt(0) == 'x') return str.substring(1);
        if (str.length() > 0 && str.charAt(1) == 'x') return str.substring(0,1)+str.substring(2);
        return str;
    }

    //JEITO NINJA!
    public String withoutX2_2(String str) {
        if (str.length() < 2)
            return "";
        else
            return (str = str.substring(0, 2).replace("x", "")+str.substring(2));
    }
}
