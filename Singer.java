from enum import Enum

# Derived Classes
class Singer(Artist):
    class Genre(Enum):
        POP = "POP"
        ROCK = "ROCK"
        CLASSICAL = "CLASSICAL"
        JAZZ = "JAZZ"
        HIPHOP = "HIPHOP"
        RNB = "RNB"

    def __init__(self, name: str, age: int, genre: 'Singer.Genre'):
        super().__init__(name, age, "Music")
        self.genre = genre

    def __str__(self):
        return (f"Singer's Info:\n"
                f"{super().__str__()}\n"
                f"Genre: {self.genre.value}")
