import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    private String text;
    Set<String> set = new HashSet<>();

    public WordChecker(String text) {
        this.text = text;
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String word : words) {
            String newText = word.toLowerCase();
            set.add(newText);
        }
    }
        public boolean hasWord (String word){
            return this.set.contains(word);

        }
    }



