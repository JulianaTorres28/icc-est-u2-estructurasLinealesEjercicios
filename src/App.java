
import utils.SignValidator;
import utils.StackSorter;
import utils.QueueUtils;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Práctica: Estructuras de Datos Lineales ---\n");
        runSignValidator();
        System.out.println("\n------------------------------------------------\n");
        runStackSorter();
        System.out.println("\n------------------------------------------------\n");
        runQueuePalindrome();
        System.out.println("\n------------------------------------------------\n");
    }

    // Ejecución del Ejercicio 01: Validación de Signos
    private static void runSignValidator() {
        System.out.println("--- Ejercicio 01: Validación de Signos ---");
        SignValidator signValidator = new SignValidator();

        String cadena1 = "{[()]}"; // VÁLIDO
        String cadena2 = "{[(])}"; // NO VÁLIDO
        String cadena3 = "([]){}"; // VÁLIDO 
        String cadena4 = "({)}"; // NO VÁLIDO 

        System.out.println("Cadena: " + cadena1 + " es válida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es válida? " + signValidator.isValid(cadena2));
        System.out.println("Cadena: " + cadena3 + " es válida? " + signValidator.isValid(cadena3));
        System.out.println("Cadena: " + cadena4 + " es válida? " + signValidator.isValid(cadena4));
    }

    // Ejecución del Ejercicio 02: Ordenar un Stack
    private static void runStackSorter() {
        System.out.println("--- Ejercicio 02: Ordenar un Stack ---");
        StackSorter stackSorter = new StackSorter();
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack Original: " + stack); 

        stackSorter.sortStack(stack);

        System.out.println("Stack Ordenado: " + stack); 

        System.out.println("Elemento en el tope (el más pequeño): " + stack.peek());
    }

    // Ejecución del Ejercicio 03: Palíndromo usando Colas
    private static void runQueuePalindrome() {
        System.out.println("--- Ejercicio 03: Palíndromo usando Colas ---");
        QueueUtils queueUtils = new QueueUtils();

        String cadena1 = "ana"; // true
        String cadena2 = "radar"; // true
        String cadena3 = "java"; // false
        String cadena4 = "AzaZA"; // true (si normalizamos a minúsculas)

        System.out.println("Cadena: \"" + cadena1 + "\" es palíndromo? " + queueUtils.isPalindrome(cadena1));
        System.out.println("Cadena: \"" + cadena2 + "\" es palíndromo? " + queueUtils.isPalindrome(cadena2));
        System.out.println("Cadena: \"" + cadena3 + "\" es palíndromo? " + queueUtils.isPalindrome(cadena3));
        System.out.println("Cadena: \"" + cadena4 + "\" es palíndromo? " + queueUtils.isPalindrome(cadena4));
    }
}
