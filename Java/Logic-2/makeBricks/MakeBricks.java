package makeBricks;

public class MakeBricks {
    //Retorne true se a soma de "small" e "big" pode formar o "goal", sabendo que cada "small" vale 1 e cada "big" tem
    //valor de 5 e não é necessário usar todos para atingir a soma, apenas importa se o "goal" pode ser atingido.

    public boolean makeBricks(int small, int big, int goal) {
        int y = big*5;
        if (y > goal) y = (goal/5)*5;
        return (y + small >= goal);
    }
}
