package bobThere;

public class BobThere {
    //Retorne true se "bob" estiver na String dada, sabendo que o "o" do "bob" pode ser substituído por qualquer coisa que
    //continuará válido.

    public boolean bobThere(String str) {
       for (int i = 0; i < str.length()-2; i++){
           if (str.startsWith("b", i) && str.startsWith("b", i+2))
               return true;
       }
       return false;
    }
}
