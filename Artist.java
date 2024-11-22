from enum import Enum

# Base Class
class Artist:
    def __init__(self, name: str, age: int, specialty: str):
        self.name = name
        self.age = age
        self.specialty = specialty

    def __str__(self):
        return (f"Artist Name: {self.name}\n"
                f"Age: {self.age}\n"
                f"Specialty: {self.specialty}")

# Derived Class
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


# Sample Outputs
# Instance of Artist class
artist = Artist("Charlie Puth", 32, "Music")
print("Instance of Artist class\n")
print(artist)

# Instance of Singer class
print("\nInstance of Singer class\n")
singer = Singer("Nayeon Im", 29, Singer.Genre.POP)
print(singer)
