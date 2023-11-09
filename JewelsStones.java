import java.util.HashSet;

public class JewelsStones {
    public static void main(String[] args) {
        String jewels = "AYOPD";
        String stones = "ayopd";
        System.out.println(isStoneJewel(jewels, stones));
    }
    public static int isStoneJewel(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i =0; i<jewels.length(); i++) {
            if(!set.contains(jewels.charAt(i))) {
                set.add(jewels.charAt(i));

            }
        }
        for(int i =0; i<stones.length();i++) {
            if(set.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
