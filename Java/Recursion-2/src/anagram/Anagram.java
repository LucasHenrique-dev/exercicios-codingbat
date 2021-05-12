package anagram;

public class Anagram {

    public void anagram(String prefix, String word) {
        if (word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String cur = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                anagram(prefix + cur, before + after);
            }
        }
    }

}
