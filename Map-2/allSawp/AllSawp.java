package allSawp;

import java.util.HashMap;
import java.util.Map;

public class AllSawp {
    //Partindo do ponto de que duas Strings combinam quando suas primeiras letras coincidem, então retorne um Array de
    //Strings cujas Strings combinates estejam com as posições trocadas, quando ocorrer a troca a String não poderá combinar
    //com mais ninguém.
    //(Ex.: (["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]).

    public String[] allSwap(String[] strings) {
        Map<String, Integer> combinantes = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String aux, letra = strings[i].substring(0,1);
            if (combinantes.containsKey(letra)){
                aux = strings[i];
                strings[i] = strings[combinantes.get(letra)];
                strings[combinantes.get(letra)] = aux;
                combinantes.remove(letra);
            } else combinantes.put(letra,i);
        }
        return strings;
    }
}
