import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String postfix = "12 7 3 - / 2 1 5 + * +";
        Stack<Integer> stack = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val2 + val1);
                        break;
                    case "-":
                        stack.push(val2 - val1);
                        break;
                    case "*":
                        stack.push(val2 * val1);
                        break;
                    case "/":
                        stack.push(val2 / val1);
                        break;
                    case "^":
                        stack.push(val2 ^ val1);
                        break;
                }
            }
        }
        int result = stack.pop();
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Evaluation Result: " + result);
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}