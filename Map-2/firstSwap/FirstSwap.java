package firstSwap;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    //Partindo do ponto de que duas Strings combinam quando suas primeiras letras coincidem, então retorne um Array de
    //Strings cujas Strings combinates estejam com as posições trocadas, quando ocorrer a troca, qualquer outra String
    //que começar com a sua mesma letra não poderá combinar com mais ninguém.
    //(Ex.: (["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]).

    public String[] firstSwap(String[] strings) {
        Map<Integer, Boolean> verificador = new HashMap<>();
        Map<String, Map<Integer,Boolean>> combinantes = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String aux, letra = strings[i].substring(0,1);
            if (combinantes.containsKey(letra) && !(boolean)combinantes.get(letra).values().toArray()[0]){
                aux = strings[i];
                strings[i] = strings[(int) combinantes.get(letra).keySet().toArray()[0]];
                strings[(int) combinantes.get(letra).keySet().toArray()[0]] = aux;
                verificador.put(i, true);
            } else verificador.put(i, combinantes.containsKey(letra));
            Map<Integer, Boolean> copia = new HashMap<>(verificador);
            combinantes.put(letra, copia);
            verificador.clear();
        }
        return strings;
    }

    //OUTRO JEITO DE SE FAZER
    public String[] firstSwap_2(String[] strings) {
        String[] result=new String[strings.length];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < strings.length; i++) {
            char c  = strings[i].charAt(0);
            if (map.containsKey(c)&&map.get(c)>=0)
            {
                int p=map.get(c);
                map.put(c,-1);

                result[i]=result[p];
                result[p]=strings[i];
            }
            else
            {
                result[i]=strings[i];
                if (!map.containsKey(c))
                    map.put(c,i);
            }
        }
        return result;
    }

}
