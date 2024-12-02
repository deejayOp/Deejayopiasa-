import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter grade for Subject 1: ");
        double grade1 = scanner.nextDouble();
        
        System.out.print("Enter grade for Subject 2: ");
        double grade2 = scanner.nextDouble();
        
        System.out.print("Enter grade for Subject 3: ");
        double grade3 = scanner.nextDouble();
        
        
        double average = (grade1 + grade2 + grade3) / 3;
        
        
        if (average >= 85) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
        
        scanner.close();
    }
}



