package withoutDoubles;

public class WithoutDoubles {
    //Retorne a soma dos 2 números dados, caso "noDoubles" for true e os números dados forem iguais, acrescente mais 1
    //unidade no primeiro valor, caso ele for 6, mude-o para 1.

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1==6) return 1+die2;
            else return die1+die2+1;
        }
        else return die1+die2;
    }
}
