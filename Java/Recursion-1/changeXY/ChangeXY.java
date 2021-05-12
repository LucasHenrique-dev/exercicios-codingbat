package changeXY;

public class ChangeXY {
    //Dado uma String "str", retorne uma nova String onde todas as aparições de "x" (minúsculo) sejam substituídas por "y".
    //Fazer recursivamente e sem loopings.

    public String changeXY(String str) {
        if (str.isEmpty()) return "";
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() > 1) stringBuilder.append(changeXY(str.substring(0,str.length()-1)));
        if (str.endsWith("x")) return stringBuilder.append("y").toString();
        else return stringBuilder.append(str.charAt(str.length()-1)).toString();
    }
}
