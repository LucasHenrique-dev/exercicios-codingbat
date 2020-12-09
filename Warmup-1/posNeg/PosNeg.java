package posNeg;

public class PosNeg {
    //Retorne true se um dos números for positivo e o outro negativo, caso o parâmetro "negative" esteja como "true"
    //retorne true se ambos forem negativos.

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a < 0 && b < 0);
        } else return (a * b < 0);
    }
}
