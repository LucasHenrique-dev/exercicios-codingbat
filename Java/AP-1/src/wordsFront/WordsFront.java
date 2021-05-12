package wordsFront;

public class WordsFront {
    //Dado um Array de Strings ("words") retorne um outro Array de Strings que possua com os "n" primeiros termos. "n"
    //deverá estar compreendido no intervalo entre 1 e "length" do Array original.

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        if (n >= 0) System.arraycopy(words, 0, result, 0, n);
        return result;
    }
}
