package bunnyEars;

public class BunnyEars {
    //Dado um número "bunnies" e sabendo que cada "bunnie" possui 2 como valor, retorne o valor total do número dado,
    //recursivamente. Sem Loopings.

    public int bunnyEars(int bunnies) {
        int result = 0;
        if (bunnies >= 1) {
            result += 2 + bunnyEars(bunnies-1);
        }
        return result;
    }

    //OUTRO MODO DE SE FAZER
    public int bunnyEars_2(int bunnies) {
        // Base case: if bunnies==0, just return 0.
        if (bunnies == 0) return 0;

        // Recursive case: otherwise, make a recursive call with bunnies-1
        // (towards the base case), and fix up what it returns.
        return 2 + bunnyEars(bunnies-1);
    }
}
