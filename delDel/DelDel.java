package delDel;

public class DelDel {
    //Se a String tiver "del" começando apartir do index 1, então retorne a String sem ela, caso contrário não altera.

    public String delDel(String str) {
        if (str.length() > 3 && str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4);
        } else return str;
    }
}
