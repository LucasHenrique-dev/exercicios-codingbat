package hasOne;

public class HasOne {
    //Dado um número "n" retorne true se ele possuir um dígito "1" em qualquer posição. "n" é um número positivo.

    public boolean hasOne(int n) {
        int cont = 0, rest = n;
        while (rest >= 9){
            if (rest%10 == 1) cont++;
            rest /= 10;
        }
        return (cont > 0 || rest == 1);
    }
}
