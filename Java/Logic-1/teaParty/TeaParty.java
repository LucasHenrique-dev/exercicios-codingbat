package teaParty;

public class TeaParty {
    //Retorne os seguintes valores,de acordo com suas respectivas instruções
    //0 -> se tanto "tea" ou "candy" forem menor que 5, sempre.
    //1 -> se tanto "tea" ou "candy" forem maior ou igual a 5
    //2 -> se, pelo menos 1 dos parâmetros, for o dobro do outro.

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        else if (Math.abs(tea-candy) >= Math.min(tea, candy)) return 2;
        else return 1;
    }
}
