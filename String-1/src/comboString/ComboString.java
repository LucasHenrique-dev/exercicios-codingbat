package comboString;

public class ComboString {
    //Retorne uma String que seja do tipo shorter+longer+shorter, ou seja, a a maior String entre as duas deve vir no
    //meio da menor, ambas as String não podem ter o mesmo tamanho, mas podem ser nulas "".

    public String comboString(String a, String b) {
        int maior = Math.max(a.length(),b.length());
        if (a.isEmpty() && b.isEmpty()){
            return a+b+a;
        } else if (maior == a.length()){
            return b+a+b;
        } else {
            return a+b+a;
        }
    }
}
