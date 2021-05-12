package countYz;

public class CountYz {
    //Retorne a quantidade de vezes que "y" e "z" aparecem no fim da String dada. Diremos que eles estarão no fim caso o
    //caractere que o sucede não for alfabético. Não será case sensitive.
    //(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

    public int countYZ(String str) {
        int cont = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char letra = Character.toLowerCase(str.charAt(i)), letra2 = Character.toLowerCase(str.charAt(i+1));
            if ((letra == 'y' || letra == 'z') && !Character.isLetter(letra2)) cont++;
        }
        if (str.toLowerCase().endsWith("y") || str.toLowerCase().endsWith("z")) cont++;
        return cont;
    }
}
