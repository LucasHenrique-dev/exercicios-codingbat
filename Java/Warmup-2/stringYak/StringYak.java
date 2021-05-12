package stringYak;

public class StringYak {
    //Retorne uma String com todos os "yak" e semelhantes fora, de modo que o "a" seja indiferente
    //(pode ser qualquer coisa), também não há sobreposição. "(EX.: ("ypk93") -> 93; ("yaktry4k) -> tr).

    public String stringYak(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-2 && str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
                i += 2;
            } else stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
