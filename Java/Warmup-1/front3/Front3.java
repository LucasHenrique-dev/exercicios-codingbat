package front3;

public class Front3 {
    //Retorne a "front" da String dada 3 vezes seguida. (A front são as 3 primeiras letras ou o que tiver até lá).

    public String front3(String str) {
        StringBuilder str2 = new StringBuilder();
        if (str.length() < 3){
            for (int i = 0; i < 3; i++) {
                str2.append(str);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                str2.append(str.substring(0,3));
            }
        }
        return str2.toString();
    }
}
