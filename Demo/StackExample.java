package Demo;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stackOfCards = new Stack<>();
        // Pushing new items to the Stack
        stackOfCards.push("5");
        System.out.println("Stack => " + stackOfCards);
        stackOfCards.push("3");
        System.out.println("Stack => " + stackOfCards);
        stackOfCards.pop();
        System.out.println("Stack => " + stackOfCards);
        stackOfCards.push("2");
        System.out.println("Stack => " + stackOfCards);
        stackOfCards.push("8");
        System.out.println("Stack => " + stackOfCards);
        stackOfCards.pop();
        System.out.println("Stack => " + stackOfCards);
        stackOfCards.pop();
        System.out.println("Stack => " + stackOfCards);
        stackOfCards.push("9");
        System.out.println("Stack => " + stackOfCards);
        stackOfCards.push("1");
        System.out.println("Stack => " + stackOfCards);
        System.out.println();
    }
}