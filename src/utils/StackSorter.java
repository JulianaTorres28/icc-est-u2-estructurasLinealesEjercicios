package utils;

import java.util.Stack;

public class StackSorter {

    public void sortStack(Stack<Integer> mainStack) {
        Stack<Integer> auxStack = new Stack<>();

        while (!mainStack.isEmpty()) {
            // 1 Sacar el elemento actual de la pila principal
            int currentElement = mainStack.pop();

            while (!auxStack.isEmpty() && auxStack.peek() > currentElement) {
                mainStack.push(auxStack.pop());
            }

            auxStack.push(currentElement);
        }

        while (!auxStack.isEmpty()) {
            mainStack.push(auxStack.pop());
        }
    }
}