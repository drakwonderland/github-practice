import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Read the user string and assign it to the variable
        String message = scanner.nextLine();

        // Print the message
        System.out.println(message);
    }
}