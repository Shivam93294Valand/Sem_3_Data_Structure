import java.util.Stack;

public class Infix_to_prefix {
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
        String Infix = "(a+b)*c+d/(b+a*c)+d";
        StringBuffer stringBuffer = new StringBuffer(Infix);
        String reversedString = stringBuffer.reverse().toString();
        String prefix = "";
        char[] arr = reversedString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                arr[i] = ')';
                i++;
            } else if (arr[i] == ')') {
                arr[i] = '(';
                i++;
            }
        }
        for (char ch : arr) {
            if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (s.peek() != '(') {
                    prefix += s.pop();
                }
                s.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!s.empty() && checkStackPresidence(ch) < checkStackPresidence(s.peek())) {
                    prefix += s.pop();
                }
                s.push(ch);
            } else if (ch == '^') {
                while (!s.empty() && checkStackPresidence(ch) <= checkStackPresidence(s.peek())) {
                    prefix += s.pop();
                }
                s.push(ch); 
            }
             else {
                prefix += ch;
            }
        }
        while (!s.isEmpty()) {
            prefix += s.pop();
        }
        StringBuffer stringBuffer2 = new StringBuffer(prefix);
        String reversedString2 = stringBuffer2.reverse().toString();
        System.out.print("Prefix notation: " + reversedString2);
    }
}