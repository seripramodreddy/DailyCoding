public class ReverseString {
    public static void main(String[]args){
        String input1 = "The Daily Byte";
        System.out.println(reverseString(input1));

    }
    public static String reverseString(String s) {
        char[] characters = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            characters[j++] = s.charAt(i);
        }
        return new String(characters);
    }
}
