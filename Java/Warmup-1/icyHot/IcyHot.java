package icyHot;

public class IcyHot {
    //Retorne true se uma das temperaturas é menor que zero e a outra é maior que 100.

    public boolean icyHot(int temp1, int temp2) {
        return temp1 * temp2 < 0 && (temp1 > 100 || temp2 > 100);
    }
}
