package fizzBuzz;

public class FizzBuzz {
    //Dado um número "start" e outro "end" retorne um Array de Strings em que começe com o "start" e vá até uma posição
    //antes de "end". Contudo, para números múltiplos de 3 preencha com "Fizz", para aqueles múltiplos por 5 "Buzz" e caso
    //seja por ambos, preencha com "FizzBuzz".
    //Ex.:((1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]; (1, 6) → ["1", "2", "Fizz", "4", "Buzz"]).

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        String fizz = "Fizz", buzz = "Buzz";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, j = start; i < end - start; i++, j++){
            String pos = String.valueOf(j);
            if (j%3 == 0) stringBuilder.append(fizz);
            if (j%5 == 0) stringBuilder.append(buzz);
            if (stringBuilder.length() > 0) result[i] = stringBuilder.toString();
            else result[i] = pos;
            stringBuilder = new StringBuilder();
        }
        return result;
    }
}
