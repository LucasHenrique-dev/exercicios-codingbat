package xyzThere;

public class XyzThere {
    //Retorne true se na String dada houver "xyz", porém não contará os casos em que ele for precedido por um ponto ".".

    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.startsWith("xyz",i) && !str.startsWith(".",i-1)){
                return true;
            }
        }
        return false;
    }
}
