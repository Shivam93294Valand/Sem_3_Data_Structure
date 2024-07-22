import java.util.Stack;

public class PrefixEvaluator {

    public static void main(String[] args) {
        String expression = "+ / 12 - 7 3 * 2 + 1 5";
        int result = evaluatePrefix(expression);
        System.out.println("The result of the prefix expression is: " + result);
    }

    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (isOperator(token)) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = applyOperator(token, operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }

    private static int applyOperator(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            case "^":
                return operand1 ^ operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
