package mixStart;

public class MixStart {
    //Retorne true se a String começar com "mix", ou tudo que lembre. (O "m" não é necessário, pode ser "pix" ou "9ix").

    public boolean mixStart(String str) {
        return  (str.length() >= 3 && str.substring(1,3).equals("ix"));
    }
}
