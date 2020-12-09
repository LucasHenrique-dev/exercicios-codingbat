package sortaSum;

public class SortaSum {
    //Retorne a soma entre "a" e "b", porém se a soma estiver no intervalo de 10 a 19, inclusive, então retorne 20.

    public int sortaSum(int a, int b){
        if (a+b >= 10 && a+b <= 19) return 20;
        else return a+b;
    }

}
