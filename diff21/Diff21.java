package diff21;

public class Diff21 {
    //Retornar a diferença absoluta entre 21 e n, caso n seja maior, retorne o dobro da diferença absoluta

    public int diff21(int n) {
        int diff = 21 - n;
        if (diff < 0){
            diff *= -2;
        }
        return diff;
    }
}
