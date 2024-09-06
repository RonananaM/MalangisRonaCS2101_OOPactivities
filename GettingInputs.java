import java.util.Scanner;

public class MusicAlbumDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and validate year input
        System.out.print("Enter the year of release (integer): ");
        int year = Integer.parseInt(scanner.nextLine());

        // Read string inputs
        System.out.print("Enter the genre of the album: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the name of the album: ");
        String album = scanner.nextLine();

        System.out.print("Enter the title of the song: ");
        String title = scanner.nextLine();

        System.out.print("Enter the artist's name: ");
        String artist = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Output the details
        System.out.println("\nAlbum Details:");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
    }
}
