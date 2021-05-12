package parenBit;

public class ParenBit {
    //Dada uma String "str" que terá um par de parênteses em seu conteúdo, retorne um string com o conteúdo entre esses
    //parênteses, inclusive. Fazer recursivamente.
    //Ex.:(("xyz(abc)123") → "(abc)"; ("x(hello)") → "(hello)"; ("(xy)1") → "(xy)").

    public String parenBit(String str) {
        if (str.length() <= 0) return "";
        char ch1 = str.charAt(0);
        int last = str.length();
        if (ch1 != '(') return parenBit(str.substring(1));
        if (str.charAt(last - 1) != ')')
            return parenBit(str.substring(0, last - 1));
        return str;
    }

    //MESMO CÓDIGO SÓ QUE MAIS OTIMIZADO E EXPLICADO
    public String parenBit_2(String str) {
        if (str.charAt(0) != '(') {
            return parenBit_2(str.substring(1));
        }
        if (str.charAt(str.length() - 1) != ')') {
            return parenBit_2(str.substring(0, str.length() - 1));
        }
        return str;

        // Solution notes: this is tricky. Is the first char a '('?
        // If not, recur, removing one char from the left of the string.
        // Eventually this gets us to '(' at the start of the string.
        // If the first char is '(', then recur similarly, removing one char from
        // the end of the string, until it is ')'.
        // Now the first and last chars are ( .. ) and you're done.
    }

}