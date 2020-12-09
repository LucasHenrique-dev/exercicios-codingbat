package love6;

public class Love6 {
    //Retorne true se "a" ou "b" forem 6, ou se a soma resulta no mesmo, ou até mesmo se a sua diferença também o for.

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) return true;
        else return  (a+b == 6 || Math.abs(a-b) == 6);
    }
}
