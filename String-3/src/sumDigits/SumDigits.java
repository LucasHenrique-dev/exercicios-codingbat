package sumDigits;

public class SumDigits {
    //Retorne a soma dos dígitos de 0 a 9 que aparecem na String dada "str", caso não haja, retorne 0.
    //(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    //Integer.parseInt(string) converts a string to an int.)

    public int sumDigits(String str) {
        int result = 0;
        for (char letra :
                str.toCharArray()) {
            if (Character.isDigit(letra)){
                result += Integer.parseInt(Character.toString(letra));
            }
        }
        return result;
    }
}
