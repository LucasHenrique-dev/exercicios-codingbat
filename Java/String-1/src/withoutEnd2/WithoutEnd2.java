package withoutEnd2;

public class WithoutEnd2 {
    //Retorne a String sem a primeira e a última letra, o "length" pode ser qualquer um, incluindo 0.

    public String withouEnd2(String str) {
        if (str.length() <= 2){
            return "";
        } else return str.substring(1,str.length()-1);
    }
}
