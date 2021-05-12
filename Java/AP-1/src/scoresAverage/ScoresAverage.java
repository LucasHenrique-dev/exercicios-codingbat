package scoresAverage;

public class ScoresAverage {
    //Dado um Array numérico ("scores"), calcule a média da primeira parte do Array, assim como a sua segunda também e depoi
    //retorne a que for maior. A segunda metade começará apartir do "length/2" e deverá ser criado um método auxiliar que
    //será chamado 2 vezes para resolver a questão. Método auxiliar: int average(int[] scores, int start, int end), onde
    //"start" e "end" determinarão o começo e fim da checagem no Array.

    public int scoresAverage(int[] scores) {
        int primeiro = average(scores,0,scores.length/2);
        int segundo = average(scores,scores.length/2,scores.length);

        return Math.max(primeiro,segundo);
    }

    public int average(int[] scores, int start, int end){
        int soma = 0;
        for (int i = start; i < end; i++) {
            soma += scores[i];
        }
        return soma/(end-start);
    }
}
