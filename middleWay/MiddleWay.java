package middleWay;

public class MiddleWay {
    //Dados 2 Arrays de "length" 3, retorne um 3° que contenha os seus valores do meio. (Ex.: ([1,2,3],[3,4,5]) -> [2,4]).

    public int[] middleWay(int[] a, int[] b) {
        int med2 = b.length/2, med1 = a.length/2;
        return new int[]{a[med1],b[med2]};
    }
}
