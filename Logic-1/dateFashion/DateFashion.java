package dateFashion;

public class DateFashion {
    //Retorne 2, 1 ou 0 de acordo com a seguinte lógica:
    //2- Quando "you" ou "date" for igual ou maior a 8, porém se um deles for 2 ou menos retorne 0, nos demais casos 1.

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        else if (you >= 8 || date >= 8) return 2;
        else return 1;
    }
}
