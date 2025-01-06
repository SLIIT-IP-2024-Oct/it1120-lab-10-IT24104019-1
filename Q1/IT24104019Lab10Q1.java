import java.util.Scanner;
public class IT24104019Lab10Q1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the mark (0-100):");
    double mark = scan.nextDouble();
    System.out.println();
    assert (mark >= 0 && mark <= 100) : "Invalid Mark";
	
    
    System.out.println("Mark is Validated");
    
    if(mark >= 75) {
    System.out.println("The Grade for the Entered Mark is:A ");
    }
    else if(mark >= 60) {
    System.out.println("The Grade for the Entered Mark is:B");
    }
    else if(mark >= 50) {
    System.out.println("The Grade for the Entered Mark is:C");
    }
    else if(mark >= 40) {
    System.out.println("The Grade for the Entered Mark is:D");
    }
    else {
    System.out.println("The Grade for the Entered Mark is:F");
    }
	
   }
}
	