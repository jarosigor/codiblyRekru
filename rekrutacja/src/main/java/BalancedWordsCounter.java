import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {
    public int count(String input) {
        if (input == null) {
            throw new RuntimeException("Input cannot be null.");
        }
        if (!input.matches("^[a-zA-Z]*$")) {
            throw new RuntimeException("Input should contain only letters.");
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                if(isBalanced(input.substring(i, j)))
                    count++;
            }
        }
        return count;
    }

    private boolean isBalanced(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int count = charCount.values().iterator().next();
        for(Integer value: charCount.values()){
            if(count != value)
                return false;
        }
        return true;
    }
}




