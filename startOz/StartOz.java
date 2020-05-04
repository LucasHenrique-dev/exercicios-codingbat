package startOz;

public class StartOz {
    //Dada a String retorne apenas as duas primeiras letras, se tivre, contudo apenas se forem O ou Z, respectivamente.
    //EX.: OLX -> O; EZZY -> Z; OZZY -> OZ.

    public String startOz(String str) {
        if (str.length() < 2){
            if (str.isEmpty()){
                str = "";
            } else if (str.charAt(0) == 'o'){
                str = "o";
            }
        } else {
            if (str.substring(0,2).equals("oz")){
                str = "oz";
            } else if (str.charAt(0) == 'o'){
                str = "o";
            } else if (str.charAt(1) == 'z'){
                str = "z";
            } else str = "";
        }
        return str;
    }

    //JEITO NINJA
    public String startOz2(String str){
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }
}
