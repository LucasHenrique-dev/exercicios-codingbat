package front22;

public class Front22 {
    //Retorne a String dada com as duas primeiras letras vindo atrás e na frente, caso não tenha duas
    //faça com o que tiver. (Ex.: CaCatCA).

    public String front22(String str) {
        if (str.length() < 2){
            return str + str + str;
        } else {
            return str.substring(0,2) + str + str.substring(0,2);
        }
    }

    //JEITO INTERESSANTE
    public String front22_2(String str) {
        // First figure the number of chars to take
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }
}
