package fizzString2;

public class FizzString2 {
    //Retorne a versão String do número int dado seguido por uma exclamação "!", porém se o número for divisível por 3,
    //retorne "Fizz", se por 5 retorne "Buzz" e caso seja divisível por ambos, retorne "FizzBuzz", em todos os casos
    //ainda terá a "!".

    public String fizzString2(int n) {
        String result = Integer.toString(n);
        if (n%3==0) result += "Fizz";
        if (n%5==0) result += "Buzz";
        if (result.contains("Fizz") || result.contains("Buzz")) return result.substring(Integer.toString(n).length())+"!";
        else return result+"!";
    }
}
