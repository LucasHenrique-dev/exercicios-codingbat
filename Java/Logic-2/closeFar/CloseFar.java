package closeFar;

public class CloseFar {
    //Retorne true se "b" ou "c" forem ao menos 1 unidade diferente de "a" e o outro for, pelo menos 2 ou mais unidades
    //diferente de ambos.
    //Ex.: ((4, 1, 3) → true; (1, 2, 3) → false).

    public boolean closeFar(int a, int b, int c) {
        int menor, maior;
        if (Math.abs(a-b) <= 1) {
            menor = b; maior = c;
        }else if (Math.abs(a-c) <= 1) {
            menor = c; maior = b;
        }else return false;
        return  (Math.abs(a-maior) >= 2 && Math.abs(menor-maior) >= 2);
    }
}
