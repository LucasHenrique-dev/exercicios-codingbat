package xyzMiddle;

public class XyzMiddle {
    //Retorne true se "xyz" estiver no meio da String dada, sendo o meio definido pela diferença de letras a direita e a
    //esquerda da palavra "xyz" que deverá ser de no máximo 1.

    public boolean xyzMiddle(String str) {
        int meio = str.length()/2;
        if (str.length() < 4 && !str.equals("xyz")) return false;
        if (str.length() % 2 == 1){
            return str.startsWith("xyz",meio-1);
        } else{
            for (int i = meio-2; i < meio; i++) {
                if (str.startsWith("xyz",i)) return true;
            }
        }
        return false;
    }
}
