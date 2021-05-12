package catDog;

public class CatDog {
    //Retorne true se as Strings "cat" e "dog" aparecem o mesmo número de vezes na String dada.

    public boolean catDog(String str) {
        int cat = 0, dog = 0;
        for (int i = 0; i < str.length()-2; i++){
            if (str.startsWith("cat", i)) cat ++;
            if (str.startsWith("dog", i)) dog ++;
        }
        return cat == dog;
    }
}
