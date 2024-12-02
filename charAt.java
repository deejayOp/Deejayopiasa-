import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Input: ");
        char inputChar = scanner.next().charAt(0);
         
        if ((input>="a"&&input<="z")||(input>="A"&&input<="Z")) {
            System.out.printIn(input+"is a letter");
        } if((input>="0"&&input<="9")){
            System.out.print(input+"is a digit");
             
        } else {
            System.out.println(input+"It's not a letter or digit");
        }
        
       
        scanner.close();
    }
}
