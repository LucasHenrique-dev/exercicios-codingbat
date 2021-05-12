package in1To10;

public class In1To10 {
    //Se "outsideMode" for false, então retorne true se "n" estiver entre 1 e 10, inclusive, de maneira análoga, porém
    //se "outsideMode" for true, então retorne true se "n" for menor que 1 ou maior que 10.

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) return (n >= 1 && n <= 10);
        else return (n >= 10 || n <= 1);
    }
}
