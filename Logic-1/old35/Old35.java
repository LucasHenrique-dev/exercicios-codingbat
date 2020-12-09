package old35;

public class Old35 {
    //Retorne true se o númeor não negativo dado for múltiplo de 3 ou 5, mas não dos 2. Use o operador Mod (%).

    public boolean old35(int n) {
        return ((n%3==0 && n%5!=0) || (n%3!=0 && n%5==0));
    }
}
