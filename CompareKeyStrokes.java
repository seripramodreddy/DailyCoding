import java.util.Stack;

public class CompareKeyStrokes {
    public static void main(String[] args) {
        String s = "cof#dim#ng";
        String t = "code";
        System.out.println(isValidate(s, t));

    }
    public static Boolean isValidate(String s , String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(char c:s.toCharArray()) {
            if(c != '#') {
                stack1.push(c);
            } else {
                stack1.pop();
            }
        }
        for(char c : t.toCharArray()) {
            if(c != '#') {
                stack2.push(c);
            } else {
                stack2.pop();
            }
        }
        return stack1.equals(stack2);
    }
}
