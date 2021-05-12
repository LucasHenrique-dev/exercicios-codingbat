package theEnd;

public class TheEnd {
    //Se o parâmetro "front" for true, então retorne a primeira letra, caso contrário a última. A String não pode ser nula.

    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        } else return str.substring(str.length()-1);
    }
}
