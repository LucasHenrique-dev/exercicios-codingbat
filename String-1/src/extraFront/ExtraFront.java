package extraFront;

public class ExtraFront {
    //Retorne um String que seja uma repetição 3 vezes das duas primeiras letras, caso o "length" da String dada seja
    //menor que 2 então retorne a repetição 3 vezes do que tiver.

    public String extraFront(String str) {
        int tam = 2;
        if (str.length() < 2) tam = str.length();
        return str.substring(0,tam)+str.substring(0,tam)+str.substring(0,tam);
    }
}
