import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "abccbefggfe";
        System.out.println(UniqueString(s));
    }

    public static String UniqueString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
