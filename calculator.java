import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Username = "deejay";
		String Password = "010203";
		System.out.println("Enter Username");
		    String username = sc.next();
		    System.out.println("Enter Password");
		    
		    String password = sc.next();
		    if (username.equals("Username") && password.equals("Password")){
	} 
	else {
		System.out.println();
		System.out.println("Valid Username or Password");
		System.out.println();
	}
		while (true) {
		   System.out.println("Enter Username");
		    username = sc.next();
		    System.out.println("Enter Password");
		   password = sc.next();
		   
		if (username.equals(Username) && password.equals(Password)) {
		    System.out.println();
		    System.out.println("Welcome");
		break;
		}
}
System.out.println();
System.out.println("CHOOSE OPERATION");
System.out.println();
String option;
String userChoice;
do {
    
System.out.println("1. Addition");
System.out.println("2. Multiplication");
System.out.println("3. Subtraction");
System.out.println("4. Devision");
System.out.println("5. Exit");

System.out.print("Enter option (1-5): ");
option = sc.next();

if (option.equals("5")) {
    System.out.println("Logout");
    break;
}


System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            
            switch (option) {
                case "1":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "3":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "4":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error");
            }
            break;
            default:
            System.out.println("Choose numbe between 1 and 5");
            break;
            }
	 
	 
	 System.out.print("Do you want to perform another operation? (yes/no): ");
            userChoice = sc.next();
        } while (userChoice.equalsIgnoreCase("yes"));

        sc.close();
}
}