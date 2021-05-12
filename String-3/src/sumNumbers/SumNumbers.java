package sumNumbers;

public class SumNumbers {
    //Retorne a soma dos números presentes na String dada "str".
    //(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    //Integer.parseInt(string) converts a string to an int.)
    //Ex.: (("abc123xyz") → 123; ("aa11b33") → 44; ("7 11") → 18).

    public int sumNumbers(String str) {
        if(str.isEmpty()) return 0;
        int result = 0, tamanho = str.length();
        char ultimaLetra = str.charAt(str.length()-1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            char letra = str.charAt(i);
            if (Character.isDigit(letra)) stringBuilder.append(letra);
            else if (stringBuilder.length() > 0){
                result += Integer.parseInt(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        }
        if (Character.isDigit(ultimaLetra)) result += Integer.parseInt(stringBuilder.toString());
        return result;
    }
}
