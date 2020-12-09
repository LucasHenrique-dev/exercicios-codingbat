package endUp;

public class EndUp {
    //Retorne a Strinh dada com as três últimas letras em maiúsculo ou qualquer letras que ela tiver, se não houver +3.

    public String endUp(String str) {
        if (str.length() <= 3){
            return str.toUpperCase();
        } else return str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }
}
