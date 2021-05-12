package triangle;

public class Triangle {
    //Dado um número "rows", retorne o números de "blocos" que seria necessário para formar o triângulo, seguindo a seguinte
    //lógica:
    //0 -> 0
    //1 -> 1
    //2 -> 3
    //3 -> 6
    //4 -> 10
    //Faça recursivamente.

    public int triangle(int rows) {
        if (rows > 0) rows += triangle(rows-1);
        return rows;
    }

    //MANEIRA MAIS EXPLÍCITA
    public int triangle_2(int rows) {
        if (rows == 0) return 0;

        return rows + triangle_2(rows  - 1);

        // Solution notes: what is triangle_2(20)? It's whatever
        // triangle_2(19) returns, plus 20.
    }
}
