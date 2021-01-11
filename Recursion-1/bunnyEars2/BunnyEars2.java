package bunnyEars2;

public class BunnyEars2 {
    //Dado um número "bunnies" e sabendo que cada "bunnie" ímpar possui 2 como valor e que cada par possui 3 como valor,
    //retorne o valor total do número dado, recursivamente. Sem Loopings ou multiplicação.

    public int bunnyEars2(int bunnies) {
        if (bunnies != 0 && bunnies%2 == 0) bunnies = 3 + bunnyEars2(bunnies-1);
        else if (bunnies%2 == 1) bunnies = 2 + bunnyEars2(bunnies-1);
        return bunnies;
    }
}
