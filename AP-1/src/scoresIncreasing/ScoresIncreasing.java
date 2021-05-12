package scoresIncreasing;

public class ScoresIncreasing {
    //Dado um Array numérico ("scores") e sabendo que ele possui um "length" de 2 ou mais, retorne true se dada a iteração
    //dos valores, eles crescem ou permanecem os mesmos. Ex.:(([1, 1, 4]) → true; ([1, 3, 4]) → true).

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i-1]) return false;
        }
        return true;
    }
}
