package endOther;

public class EndOther {
    //Retorne true se uma das Strings dada estiver contida no final da outra. O programa não deverá fazer a distinção entre
    //maiúsculas e minúsculas, o que deverá importar é a informação da String.

    public boolean endOther(String a, String b) {
        String aInfo = a.toLowerCase(), bInfo = b.toLowerCase();
        return aInfo.endsWith(bInfo) || bInfo.endsWith(aInfo);
    }
}
