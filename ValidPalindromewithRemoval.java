public class ValidPalindromewithRemoval {
    public static void main(String[] args) {
        String input1 = "abcba";
        String input2 = "abccab";
        System.out.println(validPalindrome(input2));
    }

    public static boolean validPalindrome(String s) {
        int i =0; int j = s.length() - 1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i+1, j) || isPalindrome(s, i , j--);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome(String s, int i , int j) {
        while (i < j) {
            if(s.charAt(i++) != s.charAt(j--)) {
                return  false;
            }
        }
        return true;
    }
}
