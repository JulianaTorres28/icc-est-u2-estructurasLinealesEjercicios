
from sign_validator import SignValidator 
from stack_sorter import StackSorter   
from queue_utils import QueueUtils    

def run_sign_validator():
    print("--- Ejercicio 01: Validación de Signos ---")
    sign_validator = SignValidator()

    cadena1 = "{[()]}";  # VÁLIDO
    cadena2 = "{[(])}";  # NO VÁLIDO
    cadena3 = "([]){}";  # VÁLIDO
    cadena4 = "({)}";    # NO VÁLIDO

    print(f"Cadena: {cadena1} es válida? {sign_validator.is_valid(cadena1)}")
    print(f"Cadena: {cadena2} es válida? {sign_validator.is_valid(cadena2)}")
    print(f"Cadena: {cadena3} es válida? {sign_validator.is_valid(cadena3)}")
    print(f"Cadena: {cadena4} es válida? {sign_validator.is_valid(cadena4)}")

def run_stack_sorter():
    print("--- Ejercicio 02: Ordenar un Stack ---")
    stack_sorter = StackSorter()
    
    main_stack = [5, 1, 4, 2] 

    print(f"Stack Original (Base -> Tope): {main_stack}") 

    stack_sorter.sort_stack(main_stack)

    print(f"Stack ordenado (Base -> Tope): {main_stack}") 
    print(f"Elemento en el tope: {main_stack[-1]}")

def run_queue_palindrome():
    print("--- Ejercicio 03: Palíndromo usando Colas ---")
    queue_utils = QueueUtils()

    cadena1 = "ana"    # true
    cadena2 = "radar"  # true
    cadena3 = "java"   # false
    cadena4 = "AzaZA"  # true (insensible a mayúsculas)

    print(f"Cadena: \"{cadena1}\" es palíndromo? {queue_utils.is_palindrome(cadena1)}")
    print(f"Cadena: \"{cadena2}\" es palíndromo? {queue_utils.is_palindrome(cadena2)}")
    print(f"Cadena: \"{cadena3}\" es palíndromo? {queue_utils.is_palindrome(cadena3)}")
    print(f"Cadena: \"{cadena4}\" es palíndromo? {queue_utils.is_palindrome(cadena4)}")

if __name__ == "__main__":
    print("---  Práctica: Estructuras de Datos Lineales ---\n")
    run_sign_validator()
    print("\n" + "-"*48 + "\n")
    run_stack_sorter()
    print("\n" + "-"*48 + "\n")
    run_queue_palindrome()
    print("\n" + "-"*48 + "\n")