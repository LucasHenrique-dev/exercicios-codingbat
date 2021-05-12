package xyBalance;

public class XyBalance {
    //Diremos que a String "str" é balanceada se dado um "x" possuir um "y" em algum lugar depois de sua aparição.
    //um "y" pode balancear mais de um "x", então retorne true se a String for balançeada e false caso não.
    //Ex: (("aaxbby") → true; ("yaaxbb") → false).
    //OBS.: Caso não haja "x" a String já estará balanceada.

    public boolean xyBalance(String str) {
        boolean xFound = false, yFound = false;
        for (int i = 0; i < str.length(); i++){
            if (str.startsWith("x", i)) {
                xFound = true;
                yFound = false;
            }
            if (str.startsWith("y", i) && xFound){
                xFound = false;
                yFound = true;
            }
        }
        return yFound || !str.contains("x");
    }

    //OUTRA MANEIRA INTERESSANTE
    public boolean xyBalance_2(String str) {
        // Find the rightmost y
        int y = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='y') y = i;
        }

        // Look at the x's, return false if one is after y
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='x' && i > y) return false;
        }
        return true;

        // Solution notes: this solution uses two loops, each written the simple
        // 0..length way. You could do it with a single reverse loop, noticing
        // if you see an x before a y. Or use lastIndexOf().
    }

    //JEITO NINJA EXTREME!!!
    public boolean xyBalance_3(String str){
        if (!str.contains("y"))
            str = str.replace(str,"y" + str);
        return str.lastIndexOf("y") > str.lastIndexOf("x");
    }
}
