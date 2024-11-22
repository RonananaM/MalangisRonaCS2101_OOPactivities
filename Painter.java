from enum import Enum

class Painter(Artist):
    class Medium(Enum):
        OIL = "OIL"
        WATERCOLOR = "WATERCOLOR"
        ACRYLIC = "ACRYLIC"
        PENCIL = "PENCIL"
        CHARCOAL = "CHARCOAL"

    def __init__(self, name: str, age: int, medium: 'Painter.Medium'):
        super().__init__(name, age, "Visual Arts")
        self.medium = medium

    def __str__(self):
        return (f"Painter's Info:\n"
                f"{super().__str__()}\n"
                f"Medium: {self.medium.value}")
