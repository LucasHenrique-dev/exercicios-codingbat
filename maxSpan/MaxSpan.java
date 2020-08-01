package maxSpan;

public class MaxSpan {
    //Retorne o maior intervalo entre dois números iguais dispostos na posição mais a direita e mais a esquerda no Array
    //dado ("nums"). Um intervalo é definido pela quantidade de números entre esses dois números mais a esquerda e a
    //direita, inclusive. Um Array de 1 número só terá intervalo de 1.
    //Ex.:(([1, 2, 1, 1, 3]) → 4; ([1, 4, 2, 1, 4, 1, 4]) → 6; ([1, 4, 2, 1, 4, 4, 4]) → 6).

    public int maxSpan(int[] nums) {
        int maior = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int n :
                nums) {
            stringBuilder.append(n);
        }
        for (int i = 0; i < nums.length; i++) {
            String str = stringBuilder.substring(i, i+1);
            int dif = (stringBuilder.lastIndexOf(str) - stringBuilder.indexOf(str)) + 1;
            if (dif > maior) maior = dif;
        }
        return maior;
    }
}
