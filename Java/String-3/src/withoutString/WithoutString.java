package withoutString;

public class WithoutString {
    //Retorne uma String em que todas as instâncias de "remove" são removidas da String "base". Não haverá sobreposição
    //e o funcionamento não deverá ser case sensitive. Ex.:(("xxx","xx") -> "x"; ("Hello there", "e") → "Hllo thr").

    public String withoutString(String base, String remove) {
        int tamanho = remove.length() - 1;
        for (int i = 0; i < base.length() - tamanho; i++) {
            String info = base.substring(i,i+tamanho+1);
            if (info.toLowerCase().equals(remove.toLowerCase())) base = base.replace(info,"");
        }
        return base;
    }
}
