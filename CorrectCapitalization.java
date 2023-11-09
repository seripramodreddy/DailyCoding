public class CorrectCapitalization {
    public static void main(String[] args) {
        String input = "coding";
        System.out.println(isCapitalize(input));
    }

    public static boolean isCapitalize(String s) {
        int counter =0;
        for(int i= 0;i<s.length();i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                counter++;
            }
        }
        return counter==s.length() || counter == 0 || counter == 1 && Character.isUpperCase(s.charAt(0));
    }
}
