import java.util.Stack;

public class infixtoprifix {
    public static void main(String args[]) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String str = "9-(5+3)*3/6";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            } else if (op.isEmpty() || ch == '(' || op.peek() == ')') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    while (!op.isEmpty() && (op.peek() == '+' || op.peek() == '-' || op.peek() == '*' || op.peek() == '/')) {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                    }
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                    }
                    op.push(ch);
                }
            }
        }

        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }

        String prefix = val.pop();
        System.out.println("Prefix Expression: " + prefix);
    }
}
