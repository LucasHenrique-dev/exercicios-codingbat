package caughtSpeeding;

public class CaughtSpeeding {
    //Retorne 0, 1 ou 2, seguindo a seguinte lógica:
    //0- quando "speed" for menor ou igual a 60.
    //1- quando "speed" estiver entre 61 e 80, inclusive.
    //2- quando "speed" for maior ou igual a 81.
    //Porém se "isBirthday" for true, o limite de "speed" é aumentado em 5 para todas as categorias.

    public int caughtSpeeding(int speed, boolean isBirthday){
        if (isBirthday) speed -= 5;
        if (speed <= 60) return 0;
        else if (speed >= 81) return 2;
        else return 1;
    }
}
