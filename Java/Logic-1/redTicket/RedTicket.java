package redTicket;

public class RedTicket {
    //De acordo com as relações entre "a", "b" e "c", retorne os seguintes resultados:
    //10: quando todos os números forem 2
    //5: quando eles forem iguais
    //1: quando "b" e "c" são diferentes de "a"
    //0: em todos os outros casos
    //A ordem de prioridade é de cima para baixo.

    public int redTicket(int a, int b, int c) {
        int soma = a+b+c;
        if (soma == 6) return 10;
        else if (a == b && b == c) return 5;
        if (b != a && c != a) return 1;
        else return 0;
    }
}
