package notString;

public class NotString {
    //Retorne "not" + String digitada caso ela não começe com "not", do contrário apenas retorne a String digitada.

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0,3).contains("not")){
            return str;
        } else return "not "+str;
    }
}
