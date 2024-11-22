from enum import Enum

class Writer(Artist):
    class WritingStyle(Enum):
        FICTION = "FICTION"
        NONFICTION = "NONFICTION"
        POETRY = "POETRY"
        DRAMA = "DRAMA"

    def __init__(self, name: str, age: int, style: 'Writer.WritingStyle'):
        super().__init__(name, age, "Literature")
        self.style = style

    def __str__(self):
        return (f"Writer's Info:\n"
                f"{super().__str__()}\n"
                f"Writing Style: {self.style.value}")
