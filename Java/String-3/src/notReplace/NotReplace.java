package notReplace;

public class NotReplace {
    //Retorne uma String onde todas as aparições de "is" (lower case) na String dada "str", sejam substituídas por
    //"is not", a menos que não sejam precedidos e nem sucedidos por um caractere de letra.
    //(Note: Character.isLetter(char) tests if a char is a letter.)
    //Ex.:(("This is right") → "This is not right"; ("is-is") → "is not-is not"; ("is test") → "is not test").

    public String notReplace(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("is") && str.length() == 2){
                stringBuilder.append("is not");
                i++;
            } else if (str.startsWith("is",i)){
                if (i == 0){
                    if (!Character.isLetter(str.charAt(i+2))) {
                        stringBuilder.append("is not");
                        i++;
                    } else stringBuilder.append(str.charAt(i));
                } else if (i == str.length()-2){
                    if (!Character.isLetter(str.charAt(i-1))){
                        stringBuilder.append("is not");
                        i++;
                    } else stringBuilder.append(str.charAt(i));
                } else if (!Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))){
                    stringBuilder.append("is not");
                    i++;
                } else stringBuilder.append(str.charAt(i));
            } else stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
