
class SignValidator:
    def is_valid(self, text: str) -> bool:
        stack = []

        for char in text:
            # Aperturas: las apilamos
            if char == '(' or char == '[' or char == '{':
                stack.append(char)

            # Cierres: verificamos contra la última apertura
            elif char == ')' or char == ']' or char == '}':
                if not stack:
                    return False  # Cierre sin apertura previa

                ultimo = stack.pop()

                # ¿Hacen pareja correcta?
                if not (
                    (ultimo == '(' and char == ')') or
                    (ultimo == '[' and char == ']') or
                    (ultimo == '{' and char == '}')
                ):
                    return False

            else:
                # Si aparecen otros caracteres (espacios, letras), aquí decides:
                # return False  # si quieres ser estricto
                # continue      # si quieres ignorarlos
                continue

        # Válido solo si no quedaron aperturas sin cerrar
        return len(stack) == 0
