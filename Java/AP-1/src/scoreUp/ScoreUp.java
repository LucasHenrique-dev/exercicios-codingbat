package scoreUp;

public class ScoreUp {
    //Dado 2 Arrays de String ("key" e "answers") retorne a quantidade de pontos total, seguindo as seguintes regras:
    //- Compare o primeiro valor de um com o primeiro do outro, segundo e segundo, terceiro e terceiro...
    //- A cada par coincidente deverá ser somado 4 pontos
    //- A cada par que não coincidir será subtraído 1
    //- Se na comparação o valor de "answers" for uma interrogação "?", somará-se 0.
    //Ambos os Arrays terão o mesmo tamanho.

    public int scoreUp(String[] key, String[] answers) {
        int cont = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) cont += 4;
            else if (answers[i].equals("?")) cont += 0;
            else cont--;
        }
        return cont;
    }
}
