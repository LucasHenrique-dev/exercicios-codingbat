package bigHeights;

public class BigHeights {
    //Dado um Array numérico ("heights") e números para representar o "start" e "end" retorne o número de "grandes passos",
    //sabendo que se deve fazer a soma das diferenças entre o "star" e o número sucessor, após, o sucessor passará a ser
    //o novo "start" e o processo se repetirá até que chegue ao "end". Desse modo, com um "heights" = {5, 3, 6, 7, 2},
    //um "start" = 2 e "end" = 4 o processo seria: 1 (7-6) + 5 (7-2), onde deve ser retornado 1 como resposta dos "grandes
    //passos". Eles valem tanto se for de uma maior para um menor como de um menor para um maior. O "star" deverá ser
    //menor ou igual ao "end". Ex.:(([5, 3, 6, 7, 2], 0, 1) → 0; ([5, 3, 6, 7, 2], 0, 4) → 1).

    public int bigHeights(int[] heights, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i+1]) >= 5) result++;
        }
        return result;
    }
}
