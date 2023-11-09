import java.util.Stack;

public class ValidateCharacter {
    public static void main(String[] args) {
         String input1 = "(){}[]";
         String input2 = "{(})";

         System.out.println(isValidate(input2));
    }

    public static Boolean isValidate(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0;i< s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if(s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else if(s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
