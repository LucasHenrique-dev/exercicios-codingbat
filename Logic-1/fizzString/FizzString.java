package fizzString;

public class FizzString {
    //Retrorne "Fizz" casos a String dada começar com "f", "Buzz" se ela terminar com "b" e "FizzBuzz" caso ambas as
    //condições forem atendidas, porém, se nenhuma condição for atendida, retorne a String sem alteração.

    public String fizzString(String str) {
        String result = str;
        if (str.toLowerCase().startsWith("f")) result += "Fizz";
        if (str.toLowerCase().endsWith("b")) result += "Buzz";
        if (result.contains("Fizz") || result.contains("Buzz")) return result.substring(str.length());
        else return result;
    }
}
