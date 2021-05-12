package fizzArray3;

public class FizzArray3 {
    //Dada um número para o "start" e outro para "end", retorne um Array numérico cujos valores se iniciam pelo "start"
    //e terminam até 1 número antes do "end". O parâmetro "end" pode ser maior ou igual ao "start".
    //Ex.:((11, 18) → [11, 12, 13, 14, 15, 16, 17]; (5, 10) → [5, 6, 7, 8, 9]; (1, 3) → [1, 2]).

    public int[] fizzArray3(int start, int end) {
        int[] seq = new int[end-start];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = start+i;
        }
        return seq;
    }
}
