/*
 * Nathan Van Zandt (nvz@bu.edu) 
 * 
 * A program that tests if entered strings are palindrones.
 * 
 */
import java.util.*;
public class PalindromeTest { 

// takes in a string and returns true if it is a palindrome, false if not
public static boolean isPalindrome(String s) {
    boolean isPal = false;
    int counter = 0;

    s = s.toLowerCase();

    for (int i = 0; i < s.length(); i++){
        if (Character.isLetterOrDigit(s.charAt(i)) == false) {
            s = s.replace(("" + s.charAt(i)),"" );
        }     
    }

    for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) == s.charAt(s.length()-1 -i))
        {
            counter++;
        }
    }

    if (counter == s.length())
        isPal = true;

    return isPal;
}

/*   
 * loop for testing if entered string is a palindrone. Returns 2 element array, 
 * 1st element is number of attempts, 2nd element is number of palindrones 
 */
public static int[] inputStringPalindrome() {
    int[] data = new int[2];
    int counter = 0;
    int counterP = 0;

    Scanner userInput = new Scanner(System.in);
 
    System.out.print("\nType in a line of text (a String) or \"quit\" to end: ");

    while (userInput.hasNextLine()) {
        counter++;
        String line = userInput.nextLine();

      if (line.equals("quit"))
        break;

      else {
        if(isPalindrome(line) == true) {
            counterP++;
            System.out.println("The entered string is a palindrone! ");
        }
        else
            System.out.println("The entered string is not a palindrone! ");
            System.out.print("\nType in a line of text (a String) or \"quit\" to end: ");
      }
    } 

    System.out.println("goodbye!");
    userInput.close();

    data[0] = counter;
    data[1] = counterP;
    return data;
}
    public static void main(String[] args) {
        inputStringPalindrome();
        }
}
