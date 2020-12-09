package stringMatch;

public class StringMatch {
    //Retorne o número de subtrings de tamanho 2 que sejam comuns nas duas Strings e estejam nas mesmas posições.
    //(EX.: ("abcx", "abdcx") - > 1).

    public int stringMatch(String a, String b) {
        int size, cont = 0;
        size = Math.min(a.length(), b.length());
        for (int i = 0; i < size - 1; i++) {
            if ((a.charAt(i) + a.charAt(i+1)) == (b.charAt(i) + b.charAt(i+1))) cont++;
        }
        return cont;
    }
}
