package scores100;

public class Scores100 {
    //Dado um Array numérico ("scores"), retorne true se ele possuir um valor "100" seguido por outro valor "100". O Array
    //terá um "length" de pelo menos 2.

    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == scores[i-1] && scores[i] == 100) return true;
        }
        return scores.length == 0;
    }
}
