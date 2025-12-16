
from collections import deque

class QueueUtils:

    def is_palindrome(self, text: str) -> bool:
       
        normalized_text = text.lower()

        original_queue = deque()
        
        stack = []

        for char in normalized_text:
            original_queue.append(char) 
            stack.append(char)          

        inverted_queue = deque()

        while stack:
            inverted_queue.append(stack.pop())

        while original_queue:
            if original_queue.popleft() != inverted_queue.popleft():
                return False

        return True