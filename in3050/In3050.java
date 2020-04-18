package in3050;

public class In3050 {
    //Retorna true se ambos os números etiverem no range de 30...40, inclusive ou ambos no range de 40...50, inclusive.

    public boolean in3050(int a, int b) {
        boolean a3Range = (a >= 30 && a <= 40);
        boolean a4Range = (a >= 40 && a <= 50);
        boolean b3Range = (b >= 30 && b <= 40);
        boolean b4Range = (b >= 40 && b <= 50);

        return (a3Range && b3Range) || (a4Range && b4Range);
    }
}
