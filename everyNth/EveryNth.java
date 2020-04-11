package everyNth;

public class EveryNth {
    //Dada uma String, não vazia, e um número n, maior ou igual a 1, devolva a String começando em zero e os índices
    //onde são iguais aos múltiplos de n. (EX.: Casa, n = 2 -> Cs; Bom dia, n = 2 -> Bmda).

    public String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    //JEITO INTELIGENTE
    public String everyNth_2(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
