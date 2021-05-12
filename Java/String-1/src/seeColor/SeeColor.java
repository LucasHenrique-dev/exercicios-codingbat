package seeColor;

public class SeeColor {
    //Se a String começar com "red" ou "blue" retorne-o como resposta, caso não retorne uma String vazia.

    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }
}
