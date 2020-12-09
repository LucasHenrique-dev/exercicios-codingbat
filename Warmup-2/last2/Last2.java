package last2;

public class Last2 {
    //Retorne o número de vezes que os últimos 2 chars aparecem na String, não contando o próprio e havendo sobreposição.

    public int last2(String str) {
        int cont = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+2).equals(str.substring(str.length()-2))){
                cont++;
            }
        }
        return cont;
    }
}
