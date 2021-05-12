package equalIsNot;

public class EqualIsNot {
    //Retorne true se o número de vezes que "is" e "not" aparecem na String é igual. O programa deverá funcionar de modo
    //case sensitive.

    public boolean equalIsNot(String str) {
        int isCont = 0, notCont = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String info = str.substring(i,i+3);
            String info2 = str.substring(i,i+2);
            if (info.equals("not")) notCont++;
            if (info2.equals("is")) isCont++;
        }
        if (str.endsWith("is")) isCont++;
        return isCont == notCont;
    }
}
