package mergeTwo;

public class MergeTwo {
    //Dado 2 Arrays de Strings (oredenados, sem duplicatas e de mesmo tamanho- "a" e "b"), retorne outro Array de Strings
    //que possua os "n" primeiros elementos dos Arrays "a" e "b". O Array retornado deverá estar em ordem alfabética e
    //sem duplicatas. Ex.:((["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]; (["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"];
    //(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]).

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        for (int i = 0, j = 0, k = 0; k < n; i++){
            if (a[i].compareTo(b[j]) > 0) {
                result[k++] = b[j];
                i--;
                j++;
            } else if (a[i].compareTo(b[j]) < 0) result[k++] = a[i];
            else result[k++] = b[j++];
        }
        return result;
    }
}
