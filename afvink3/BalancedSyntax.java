package afvink3;

public class BalancedSyntax {
    static class stack {
        int top = -1;
        char[] items = new char[100];

        void push(char x) {
            if (top == 99) {
                System.out.println("Stack is full");
            } else {
                items[++top] = x;
            }
        }

        char pop() {
            if (top == -1) {
                System.out.println("Underflow error");
                return '\0';
            } else {
                char element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    private static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else return character1 == '[' && character2 == ']';
    }

    private static boolean areParenthesisBalanced(char[] exp) {

        stack st = new stack();

        for (char c : exp) {

            if (c == '{' || c == '(' || c == '[')
                st.push(c);

            if (c == '}' || c == ')' || c == ']') {
                if (st.isEmpty()) {
                    return false;
                } else if (!isMatchingPair(st.pop(), c)) {
                    return false;
                }
            }

        }

        if (st.isEmpty())
            return true; /*balanced*/
        else {   /*not balanced*/
            return false;
        }
    }

    public static void main(String[] args) {
        char[] exp = {'{', ')', '}', '[', ']'};
        if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

} 