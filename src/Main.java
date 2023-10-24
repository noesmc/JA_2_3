import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        while (true) {
            System.out.print("Please enter your score: ");
            try {
                score = Integer.parseInt(scanner.next());
                 if (score >= 70 && score <= 100) {
                    System.out.println("Congrats! You’ve passed the test!");
                    break;
                    } else if (score >= 0 && score < 70) {
                    System.out.println("Sorry, you’ve failed the test.");
                    break;
                    } else {
                     System.out.println("Enter a value from the range 0 to 100");
                 }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
            }
        }
    }
}