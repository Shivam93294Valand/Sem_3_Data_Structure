import java.util.Stack;

public class Infix_to_postfix {
    public static int checkStackPresidence(char c) {
        if (c == '+' || c == '-') {
            return 2;
        } else if (c == '*' || c == '/') {
            return 4;
        } else if (c == '^') {
            return 5;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String Infix = "(a+b^c^d)*(e+f/d)";
        String postfix = "";
        s.push('(');
        Infix += ')';
        char[] arr = Infix.toCharArray();
        for (char ch : arr) {
            if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (s.peek() != '(') {
                    postfix += s.pop();
                }
                s.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!s.empty() && checkStackPresidence(ch) <= checkStackPresidence(s.peek())) {
                    postfix += s.pop();
                }
                s.push(ch);
            } else if (ch == '^') {
                while (!s.empty() && checkStackPresidence(ch) < checkStackPresidence(s.peek())) {
                    postfix += s.pop();
                }
                s.push(ch);
            } else {
                postfix += ch;
            }
        }
        while (!s.isEmpty()) {
            postfix += s.pop();
        }
        System.out.print("Postfix notation: " + postfix);
    }
}