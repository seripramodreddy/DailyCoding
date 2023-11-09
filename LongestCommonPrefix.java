public class LongestCommonPrefix {
    public static void main(String[] args) {
         String[] input = {"colorado", "color", "cold"};
         String[] input2 = {"spot", "spotty", "spotted"};
         String[] input3 = {"a", "b", "c"};
         System.out.println(longestcommonprefix(input3));

    }
    public static String longestcommonprefix(String[] str) {
          StringBuilder result = new StringBuilder();
          int index = 0;

          for(char c :str[0].toCharArray()) {
              for(int i= 1; i< str.length; i++) {
                  if (index >= str[i].length() || c != str[i].charAt(index)) {
                      return result.toString();
                  }
              }
                  result.append(c);
                  index++;
          }

          return result.toString();
    }
}
