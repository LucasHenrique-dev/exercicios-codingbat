package scoresClump;

public class ScoresClump {
    //Dado um Array numérico ("scores"), retorne true se ele possuir uma seqência de 3 números os quais estaram distantes
    //um dos outros por no máximo 2. O Array dado estará em ordem cresscente.

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i+2] - scores[i] <= 2) return true;
        }
        return false;
    }
}
