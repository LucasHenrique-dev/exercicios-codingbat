package or35;

public class Or35 {
    //Retorna true se o númeor não negativo dado é divisível pro 3 ou 5.

    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }
}
