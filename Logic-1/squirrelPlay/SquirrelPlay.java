package squirrelPlay;

public class SquirrelPlay {
    //Retorne true se "temp" estiver no intervalo de 60 a 90, inclusive, a menos que "isSummer" seja true, nesse caso o
    //o limite máximo é 100, inclusive.

    public boolean squirrelPlay(int temp, boolean isSummer){
        if (isSummer && temp <= 100 && temp >= 60) return true;
        else return (temp >= 60 && temp <= 90);
    }
}
