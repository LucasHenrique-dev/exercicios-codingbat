package sumHeights;

public class SumHeights {
    //Dado um Array numérico ("heights") e números para representar o "start" e "end" retorne a soma das diferenças entre
    //o "star" e o número sucessor, após, o sucessor passará a ser o novo "start" e o processo se repetirá até que chegue
    //ao "end". Desse modo, com um "heights" = {5, 3, 6, 7, 2}, um "start" = 2 e "end" = 4 a soma retornada será: 1 (7-6)
    //+ 5 (7-2) = 6. Ex.:(([5, 3, 6, 7, 2], 0, 1) → 2; ([5, 3, 6, 7, 2], 0, 4) → 11). O "star" deverá ser menor ou igual
    //ao "end".

    public int sumHeights(int[] heights, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            result += Math.abs(heights[i]-heights[i+1]);
        }
        return result;
    }
}
