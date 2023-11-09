import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s= "program";
        String t ="function";
        System.out.println(isValid(s, t));
    }
    public static boolean isValid(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<t.length();i++) {
            if(!map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), 1);
            }
            else {
                map.put(t.charAt(i),map.get(t.charAt(i)) +1);
            }
        }

        for(int i = 0; i< s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
            } else {
                return false;
            }
        }
        for(int value: map.values()) {
            if(value !=0) return false;
        }

        return true;

    }
}
