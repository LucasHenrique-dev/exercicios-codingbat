package close10;

public class Close10 {
    //Retorne o número que mais se aproxima do 10, ou zero se as distâncias forem as mesmas.

    public int close10(int a, int b) {
        int bdist = Math.abs(10 - b), adist = Math.abs(10 - a);
        if (adist == bdist){
            return 0;
        } else return (adist < bdist)? a: b;
    }
}
