package in1020;

public class In1020 {
    //Retorne true se um dos números estiver no range de 10...20, inclusive

    public boolean in1020(int a, int b) {
        return ((a - 10 >= 0 && a - 20 <= 0) || (b - 10 >= 0 && b - 20 <= 0));
    }
}
