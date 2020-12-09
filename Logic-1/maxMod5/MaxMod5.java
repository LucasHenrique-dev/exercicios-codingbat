package maxMod5;

public class MaxMod5 {
    //Retorne o maior valor entre os números dados, porém se eles possuirem o mesmo resto quando divididos por 5, retorne
    //o menor entre eles. Em todos os casos se ambos forem iguais retorne 0.

    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a, b);
        else return Math.max(a,b);
    }
}
