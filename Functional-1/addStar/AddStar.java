package addStar;

import java.util.List;

public class AddStar {
    //Dada uma lista de Strings retorne-a com um asterísco "*" no fim de cada String. Ex.:((["olá","bom"]) -> ["olá*","bom*"].

    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n+"*");
        return strings;
    }
}
