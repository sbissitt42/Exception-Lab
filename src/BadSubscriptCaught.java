import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] firstNames = {"Simon", "Bob", "Charlie", "David", "Chris", "Frank", "Joseph", "Henry", "George", "Jack"};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the position to display the name (1-10): ");
            int position = scanner.nextInt();

            String requestedName = firstNames[position - 1];
            System.out.println("Name # " + position + ": " + requestedName);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range. Please enter a valid position (1-10).");
        }  {
            scanner.close();
        }
    }
}
