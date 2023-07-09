/*
 * SimpleStats.java
 * 
 * A simple interactive program that performs operations 
 * on a set of three integers.
 *
 * CS112
 * Nathan Van Zandt (nvz@bu.edu)
 */

 import java.util.*;

 /*
  * Program Class Defintion
  */
 public class SimpleStats {
 
     /*
      * printMenu()
      *
      * Method to display user options.
      */
     public static void printMenu() {
         System.out.println("(0) Enter new numbers");
         System.out.println("(1) Find the largest");
         System.out.println("(2) Compute the sum");
         System.out.println("(3) Compute the range (largest - smallest)");
         System.out.println("(4) Compute the average");
         System.out.println("(5) Print the numbers in ascending order");
         System.out.println("(6) Quit");
         System.out.println();
     }
     
     /*** PUT YOUR SEPARATE HELPER METHODS FOR OPTIONS 1-5 HERE ***/

 // returns the largest number
 public static int largest(int n1, int n2, int n3) { 
    int largest;
    if (n1 >= n2 &&  n1 >= n3)
    largest = n1;

    else if (n2 >= n1 && n2 >= n3)
    largest = n2; 

    else 
    largest = n3;

    return largest;
 }
 
 // returns the smallest number
 public static int smallest(int n1, int n2, int n3){
    int smallest;
    if (n1 <= n2 && n1 <= n3)
    smallest = n1; 

    else if (n2 <= n1 && n2 <= n3)
    smallest = n2;

    else 
    smallest = n3;

    return smallest;
 }

 // returns the median 
 public static int median(int n1, int n2, int n3){
    int median = sum(n1,n2,n3) - largest(n1,n2,n3) - smallest(n1,n2,n3);
    return median;
 }

 // returns the sum
 public static int sum(int n1, int n2, int n3) { 
    int sum = n1 + n2 + n3; 
    return sum;
 }

 // returns the range
 public static int range(int n1, int n2, int n3) { 
    int range = largest(n1,n2,n3) - smallest(n1,n2,n3); 
    return range;
 }

 // returns the average
 public static double average(int n1, int n2, int n3) { 
    double average = sum(n1, n2, n3) / 3.0; 
    return average;
 }

 // returns a string of the numbers in ascending order
 public static String ascending(int n1, int n2, int n3) { 
    String order = smallest(n1,n2,n3) + " " + median(n1,n2,n3) + " " + largest(n1,n2,n3);
    return order;
 }

     
     /*
      * main()
      *
      * Program execution begins with this method.
      */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);        
 
         // variable declarations 
         int n1 = 0;
         int n2 = 0;
         int n3 = 0;
         int choice;
         boolean more_input = true;
         boolean numbersEntered = false;
         
         System.out.println("Welcome to my awesome program");
         System.out.println("Are you ready for some math?" + '\n');
     /*
       * Control loop
       */
        
         do {
             
            
             printMenu();
             
             System.out.print("Enter choice: ");
             choice = scan.nextInt();

             if (choice == 0){
             System.out.print("Enter three numbers: ");
             n1 = scan.nextInt();
             n2 = scan.nextInt(); 
             n3 = scan.nextInt();
             System.out.println("Numbers entered are: " + n1 + " " + n2 + " " + n3 + '\n');
             numbersEntered = true;
             }

             if (numbersEntered == false)
             System.out.println("Cannot compute, numbers have not been entered " + '\n'); 

             if (numbersEntered == true){ 
                if (choice == 1) 
                System.out.println("Largest number entered is: " + largest(n1, n2, n3) + '\n');

                else if (choice == 2)
                System.out.println("Sum is: " + sum(n1, n2, n3) + '\n');

                else if (choice == 3)
                System.out.println("Range is: " + range(n1, n2, n3) + '\n');

                else if (choice == 4)
                System.out.println("Average is: " + average(n1, n2, n3) + '\n');

                else if (choice == 5)
                System.out.println("The numbers in ascending order are: " + ascending(n1, n2, n3) + '\n');

                else if (choice == 6){
                System.out.println('\n' + "Have a nice day!");
                more_input = false;
                }

                else if (choice != 0)
                System.out.println("Invalid choice. Please try again. " + '\n');

                if (more_input == true)
                System.out.println("Numbers are: "+ n1 + " " + n2 + " " + n3);
                
             }



             
         } while (more_input);
         
         
     }
 }