package getSandwich;

public class GetSandwich {
    //Dada a String "str", retorne a palavra que estiver entre as palavras "bread" da String, caso não haja o par de
    //palavras "bread" em "str", então retorne vazio.

    public String getSandwich(String str) {
        int primeiro, segundo;
        if (str.contains("bread")){
            primeiro = str.indexOf("bread");
            if (str.substring(primeiro+4).contains("bread")){
                segundo = str.lastIndexOf("bread");
                return str.substring(primeiro+5,segundo);
            } else return "";
        } else return "";
    }
}
