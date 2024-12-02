import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String option;
	   do {
	       System.out.println("Do you have a fever (Yes or No)");
	       String choice1 = sc.next();
	       System.out.println("Do you have cough (Yes or No)");
	       String choice2 = sc.next();
	       System.out.println("Do you have defficulty breathing (Yes or No)");
	       String choice3 = sc.next();
    if (choice1.equals("Yes") && choice2.equals("Yes") && choice3.equals("Yes")){
    System.out.println("You do not exhibit significant COVID-19 symptoms. Stay safe!");
	 } else {
	   System.out.println("You may have COVID-19 symptoms. Pleas consult healthcare doctor");
	   System.out.println("Do you want to perform another opiration? (Yes or No): ");
	 }
	   option = sc.next();
	 } while (option.equals("Yes"));
	 sc.close();
	   
	   }
}