
class StackSorter:
   

    def sort_stack(self, main_stack: list) -> None:
       
        aux_stack = []

        while main_stack:
            current_element = main_stack.pop()

            while aux_stack and aux_stack[-1] > current_element:
                main_stack.append(aux_stack.pop())

          
            aux_stack.append(current_element)

        
        while aux_stack:
            main_stack.append(aux_stack.pop())