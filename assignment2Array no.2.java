import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        String[] students = {"John", "Alice", "Bob", "Eve"};
        int[] scores = {85, 92, 76, 88};

        displayScores(students, scores);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student to update the score: ");
        String name = scanner.nextLine();
        System.out.print("Enter the new score for " + name + ": ");
        int newScore = scanner.nextInt();

        updateScore(students, scores, name, newScore);
        displayScores(students, scores);
    }

    private static void displayScores(String[] students, int[] scores) {
        System.out.println("Student List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "-" + scores[i]);
        }
    }

    private static void updateScore(String[] students, int[] scores, String name, int newScore) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                scores[i] = newScore;
                break;
            }
        }
    }
}

