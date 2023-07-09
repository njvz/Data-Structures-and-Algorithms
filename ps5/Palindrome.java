/*
 * Palindrome.java
 *
 * Computer Science 112
 *
 * Modifications and additions by:
 *     name: Nathan Van Zandt (nvz@bu.edu)
 *     username:
 */
   
public class Palindrome {
    // Add your definition of isPal here. 

    /* 
     * takes a String object as a parameter and determines  
     * if it is a palindrome, returning true if it is and false  
     * if it is not
     */
    public static boolean isPal(String s) { 
        ArrayStack<Character> temp1 = new ArrayStack<Character>(s.length());  
        ArrayQueue<Character> temp2 = new ArrayQueue<Character>(s.length()); 
        boolean isPal = true; 

        s = s.toLowerCase(); 
        for (int i = 0; i < s.length(); i++) {  
            if (Character.isLetter(s.charAt(i))){
                temp1.push(s.charAt(i)); 
                temp2.insert(s.charAt(i));
            }
        } 

        while (!temp1.isEmpty() && !temp2.isEmpty()) { 
            if (temp1.pop() != temp2.remove()) { 
                isPal = false;             
            }
        }

        return isPal;
    }
    
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);


        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        /*
         * Add five more unit tests that test a variety of different
         * cases. Follow the same format that we have used above.
         */ 
        
         System.out.println("(1) Testing on \"race car\"");
         try {
             boolean results = isPal("race car");
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println("true");
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == true);
 
 
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 
       
         // test 2
         System.out.println("(2) Testing on \"t!a!c +++o c!a!t\"");
         try {
             boolean results = isPal("t!a!c o c!a!t");
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println("true");
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == true);
 
 
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 

         // test 3
         System.out.println("(3) Testing on \"not a palindrome\"");
         try {
             boolean results = isPal("not a palindrome123");
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println("false");
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == false);
 
 
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 

         // test 4
         System.out.println("(4) Testing on \"RaceCart\"");
         try {
             boolean results = isPal("RaceCart");
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println("false");
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == false);
 
 
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 

         // test 5
         System.out.println("(5) Testing on \"Madam, I'm Adam\"");
         try {
             boolean results = isPal("Madam, I'm Adam");
             System.out.println("actual results:");
             System.out.println(results);
             System.out.println("expected results:");
             System.out.println("true");
             System.out.print("MATCHES EXPECTED RESULTS?: ");
             System.out.println(results == true);
 
 
         } catch (Exception e) {
             System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
         }
         
         System.out.println(); 

    }
}