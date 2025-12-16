package utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String signos) {
        Stack<Character> stack = new Stack<Character>();

        // toCharArray sirve para volver un arreglo a un caracter
        char[] caracteres = signos.toCharArray();
        for (Character character : caracteres) {
            // character -> (
            // character -> }
            // 1 -> Comprobar si es apertura o cierre
            if (getIsApertura(character)) {
                // Ingresar a la pila
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ultimo = stack.pop();// Apertura
                // ultimo es del mismo tipo que el character?
                if (!isTipoIgual(ultimo, character)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean getIsApertura(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    public boolean isTipoIgual(char ultimo, char character) {
        //Ulitmo es la apertura y character el de cierre
        return ultimo == '(' && character == ')'
                || ultimo == '[' && character == ']'
                || ultimo == '{' && character == '}';
    }

}
