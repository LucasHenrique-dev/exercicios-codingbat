package withoutX;

public class WithoutX {
    //Se a String começar ou terminar com "x", então retorne-a sem os repectivos "x", caso não retorne ela inalterada.

    public String withoutX(String str) {
        if (str.startsWith("x") && str.endsWith("x") && str.length() > 1) return str.substring(1,str.length()-1);
        if (str.startsWith("x")) return str.substring(1);
        if (str.endsWith("x")) return str.substring(0,str.length()-1);
        return str;
    }

    //PENSANDO DE UMA FORMA DIFERENTE...
    public String withoutX_2(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
            str = str.substring(0, str.length()-1);
        }

        return str;

        // Solution  notes: check for the 'x' in both spots. If found, use substring()
        // to grab the part without the 'x'. Check that the length is greater than 0
        // each time -- the need for the second length check is tricky to see.
        // One could .substring() instead of .charAt() to look into the string.
    }
}
