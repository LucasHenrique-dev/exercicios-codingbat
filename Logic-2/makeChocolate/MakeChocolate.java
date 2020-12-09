package makeChocolate;

public class MakeChocolate {
    //Retorne o número de "small" que seja necessário para atingir o "goal", sabendo que o "big" será usando antes do "small"
    //e que cada "small" vale 1 e cada "big" vale 5. Caso não dê para atingir o "goal" retorne -1.
    //Ex.: ((4, 1, 7) → 2; (4, 1, 10) → -1).

    public int makeChocolate(int small, int big, int goal) {
        int totBig = 5*big;
        if (totBig > goal) totBig = (goal/5)*5;
        if (small + totBig >= goal) return goal-totBig;
        else return -1;
    }
}
