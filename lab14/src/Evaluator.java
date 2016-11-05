import java.util.Stack;

/**
 * Created by yuan105 on 7/28/16.
 */
public class Evaluator extends Stack {
    static Stack<Double> stack;
    public Evaluator() {
        stack = new Stack();
    }
    public static double evaluator(String input) {
        String[] prn = input.split(" ");
        for (int i = 0; i < prn.length; i++) {
            if (prn[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
            }
            else if (prn[i].equals("-")) {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b - a);
            }
            else if (prn[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());
            }
            else if (prn[i].equals("/")) {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b / a);
            }
            else
                stack.push(Double.parseDouble(prn[i]));
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        Evaluator e = new Evaluator();
        String input = "5 1 2 + 4 * + 3 - 2 / 10 +";
        System.out.println(e.evaluator(input));
    }
}