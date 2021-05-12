package withoutEnd;

public class WithoutEnd {
    //Retorne a String sem o primeiro e o último chars, a String dada deve ter um length de 2, pelo menos.

    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }
}
