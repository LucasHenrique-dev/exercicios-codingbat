package startHi;

public class StartHi {
    //Retorne true se a String dada começa com "hi".

    public boolean startHi(String str) {
        boolean result = false;
        if (str.length() >=2 && str.substring(0,2).toLowerCase().equals("hi")){
            result = true;
        }
        return result;
    }
}
