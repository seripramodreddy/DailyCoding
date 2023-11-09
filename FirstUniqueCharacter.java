import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "abababbba";
        System.out.println(isUniqueCharacterIndex(input));
    }

    public static int isUniqueCharacterIndex(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), Integer.MAX_VALUE);
            } else
            {
                map.put(s.charAt(i), i);
            }
        }

        int min = Integer.MAX_VALUE;
        for(char c:map.keySet()) {
            min = Math.min(min, map.get(c));
        }

        return min == Integer.MAX_VALUE? -1 : min;
    }
}
