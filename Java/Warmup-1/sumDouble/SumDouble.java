package sumDouble;

public class SumDouble {
    //Retorne a soma de dois valores, a menos que eles sejam iguais. Desse modo, retorne o dobro da soma.

    public int sumDouble(int a, int b) {
        if (a != b){
            return (a+b);
        } else return 2*(a+b);
    }
}
