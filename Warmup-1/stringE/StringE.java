package stringE;

public class StringE {
    //Retorne true se a String dada possuiu entre 1 e 3 'e'.

    public boolean stringE(String str) {
        int cont = 0;
        for (char ch :
                str.toCharArray()) {
            if (ch == 'e'){
                cont++;
            }
        }
        return cont >= 1 && cont <= 3;
    }
}
