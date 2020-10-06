import java.util.Scanner; 

/**
 * program that will ask the user for a number between 1 and 10. It will then draw a line of * that is the size that was asked for.
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt user to enter in a number between 1 and 10 
    System.out.println("Please enter a number between 1 and 10"); 
    int userNum = input.nextInt(); 

    //output amount of stars that equal the value of the user's number 
    for(int count = 1; count <= userNum; count++){
      System.out.print("*"); 
    }
    
  }
}
