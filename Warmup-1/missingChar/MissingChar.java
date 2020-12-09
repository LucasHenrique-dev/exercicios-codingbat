package missingChar;

public class MissingChar {
    //Retorne a String dada com o índice do caractere indicado removido.

    public String missingChar(String str, int n) {
        if (n > str.length()) {
          return "O número passado excede o valor máximo da String";
        } else {
            return (str.substring(0, n) + str.substring(n + 1));
        }
    }
}
