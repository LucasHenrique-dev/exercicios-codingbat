package greenTicket;

public class GreenTicket {
    //Dados os inteiros "a", "b" e "c", retorne os seguintes valores de acordo com suas seguintes condições:
    //0: caso os 3 números sejam diferentes
    //10: caso haja 2 iguais
    //20: caso sejam todos iguais

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) return 20;
        if (a != b && b != c && a != c) return 0;
        else return 10;
    }
}
