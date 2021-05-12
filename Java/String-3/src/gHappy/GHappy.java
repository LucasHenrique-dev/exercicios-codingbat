package gHappy;

public class GHappy {
    //Retorne true se para cada "g" minúsculo encontrado na String "str", houver outro imediatamente em sua direita ou
    //esquerda.

    public boolean gHappy(String str) {
        boolean gHappy = true;
        str = str.toLowerCase();
        if (str.length() == 1) return false;
        if (str.startsWith("g") && str.charAt(1) != 'g') gHappy = false;
        for (int i = 1; i < str.length() - 1; i++) {
            char letra1 = str.charAt(i), letra2 = str.charAt(i+1), letra3 = str.charAt(i-1);
            if (letra1 == 'g') {
                gHappy = (letra1 == letra2 || letra1 == letra3);
                i++;
            }
        }
        if (str.endsWith("g") && str.charAt(str.length()-2) != 'g') gHappy = false;
        return gHappy;
    }
}
