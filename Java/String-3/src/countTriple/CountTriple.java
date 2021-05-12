package countTriple;

public class CountTriple {
    //Retorne o número de triplos (caracteres que se repetem 3 vezes em seqência) que aparecem na String dada. O triplo
    //pode sobrepor.

    public int countTriple(String str) {
        int triCont = 0, cont;
        for (int i = 0; i < str.length()-2; i++){
            String info = str.substring(i, i+3);
            char letra = info.charAt(0);
            cont = 0;
            for (int j = 0; j < info.length(); j++){
                if(info.charAt(j) == letra){
                    cont++;
                }
                if(cont == 3) triCont++;
            }
        }
        return triCont;
    }
}
