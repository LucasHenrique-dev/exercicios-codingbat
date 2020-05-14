package doubleX;

public class DoubleX {
    //Retorna true se a primeira instância de "x" for precedidda, imediatamente, por outro "x".

    public boolean doubleX(String str) {
        if (!str.contains("x") || str.indexOf("x") == str.length()-1) {
            return false;
        } else {
            return (str.charAt(str.indexOf("x")+1) == 'x');
        }
    }

    //NOVAS MECÂNICAS
    public boolean doubleX_2(String str) {
        int x = str.indexOf("x");
        if (x == -1) return false;
        return str.substring(x).startsWith("xx");
    }
}
