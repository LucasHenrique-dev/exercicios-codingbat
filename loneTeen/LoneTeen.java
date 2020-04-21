package loneTeen;

public class LoneTeen {
    //Retorne true se um dos números dados estiver no range de 13...19, inclusive. Porém, apenas 1 deles.

    public boolean loneTeen(int a, int b) {
        return !(a >= 13 && a <= 19 && b >= 13 && b <= 19) && ((a >= 13 && a <= 19) || (b >= 13 && b <= 19));
    }

    //Usando o operador XOR (^). Menção do site: "Alternately could use the Java xor operator, but it's obscure."
    public boolean loneTeen2(int a, int b){
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return aTeen ^ bTeen;
    }
}
