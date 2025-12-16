package utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUtils {

    public boolean isPalindrome(String str) {
        
        String normalizedStr = str.toLowerCase();

        Queue<Character> originalQueue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : normalizedStr.toCharArray()) {
            originalQueue.offer(c); // Cola: Orden natural
            stack.push(c); // Pila: Orden inverso para luego llenar la segunda cola
        }

        Queue<Character> invertedQueue = new LinkedList<>();

        while (!stack.isEmpty()) {
            invertedQueue.offer(stack.pop());
        }

        while (!originalQueue.isEmpty()) {
           
            if (!originalQueue.poll().equals(invertedQueue.poll())) {
                return false;
            }
        }

        return true;
    }
}