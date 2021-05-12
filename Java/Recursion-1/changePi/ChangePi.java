package changePi;

public class ChangePi {
    //Dado uma String "str", retorne uma nova em que cada ocorrência da string "pi" seja substituída por "3.14". Fazer
    //recursivamente e sem looping.

    public String changePi(String str) {
        String novo = str.replace("pi","3.14");
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() < 1) return "";
        stringBuilder.append(changePi(novo.substring(0,novo.length()-1)));
        return stringBuilder.append(novo.charAt(novo.length()-1)).toString();
    }

    //OUTRO JEITO DE SE FAZER... ATÉ MAIS DIGNO KKK
    public String changePi_2(String str) {
        if (str.length() < 2)
            return str;
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        if (c1 == 'p' && c2 == 'i')
            return "3.14" + changePi_2(str.substring(2));
        return c1 + changePi_2(str.substring(1));
    }
}
