package dividesSelf;

public class DividesSelf {
    //Dado um número "n" retorne true se todos os dígitos que o compõe podem dividi-lo. "n" é um número positivo.

    public boolean dividesSelf(int n) {
        int aux = n;
        while (aux >= 9){
            if (aux%10 == 0 || n % (aux%10) != 0) return false;
            aux /= 10;
        }
        return aux > 0 && n % aux == 0;
    }
}
