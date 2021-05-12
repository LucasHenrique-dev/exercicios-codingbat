package starOut;

public class StarOut {
    //Retorne uma String em que os caracteres "*" (asterísco) e os que estão em seu entorno sejam removidos da String dada.
    //Ex.:(("ab*cd") → "ad"; ("ab**cd") → "ad"; ("sm*eilly") → "silly").

    public String starOut(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int ast1, ast2, dist1, dist2;
            ast1 = str.indexOf('*',i);
            ast2 = str.lastIndexOf('*',i);
            if (ast1 == -1) ast1 = -2;
            if (ast2 == -1) ast2 = -2;
            dist1 = Math.abs(i-ast1);
            dist2 = Math.abs(i-ast2);
            if (dist1 > 1 && dist2 > 1) stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
