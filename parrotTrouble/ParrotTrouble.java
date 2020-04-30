package parrotTrouble;

public class ParrotTrouble {
    //Retorne true se o papagaio estiver falando antes das 7 ou após as 20. Horas de 0 até 23.

    public boolean parrotTrouble(boolean talking, int hour) {
        boolean result = false;
        if (hour < 7 || hour > 20){
            result = true;
        }
        return (talking && result);
    }
}
