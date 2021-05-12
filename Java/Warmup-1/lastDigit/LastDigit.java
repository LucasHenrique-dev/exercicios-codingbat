package lastDigit;

public class LastDigit {
    //Retorna true se o último dígito entre os dois números for igual.

    public boolean lastDigit(int a, int b) {
        int aRest = a, bRest = b;
        while (aRest >= 10 || bRest >= 10){
            aRest = aRest % 10;
            bRest = bRest % 10;
        }
        return aRest == bRest;
    }

    //OH YES, TÁ BOM POR HOJE... ESSA FOI TRISTE.
    public boolean lastDigit_2(int a, int b) {
        // True if the last digits are the same
        return(a % 10 == b % 10);
    }
}
