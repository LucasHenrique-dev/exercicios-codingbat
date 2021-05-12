package nestParen;

public class NestParen {
    //Dado uma String "str", retorne true se ela for uma estrutura aninhada de pares de parênteses ou for nula. Fazer
    //recursivamente. Ex.:(("(((x))") → false; ("((()))") → true; ("(())") → true).

    public boolean nestParen(String str) {
        if (str.length() <= 0) return true;
        if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
            return nestParen(str.substring(1,str.length()-1));
        return false;
    }
}
