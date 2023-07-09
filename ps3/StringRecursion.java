/*    
* Nathan Van Zandt (bu.edu) 
*  
* Practice with string recursion
*/
public class StringRecursion { 

    // Takes a string and prints it in reverse
    public static void printReverse(String str) { 
        if (str.equals(""))
            System.out.println("");
        else { 
            printReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
    
    // Takes a string and returns a string without any leading and/or 
    // trailing spaces
    public static String trim(String str) { 
        if (str == null || str.equals("")){
            return str;
        }
        else {
            if (str.charAt(0) == ' '){
                return trim(str.substring(1));
            }
            if (str.charAt(str.length()-1) == ' ') {
                return trim(str.substring(0,str.length()-1));
            } 
        }   
            return str;
    }

    // Takes a char and string and returns the index of the first occurence 
    // of the char in the string or -1 if the char isn't in the string
    public static int find(char ch, String str) { 
        if (str == null || str.equals("")) {
            return -1; // Character not found
        }
        
        if (str.charAt(0) == ch) {
            return 0; 
        }
        
        int rest = find(ch, str.substring(1)); 
        if (rest == -1) {
            return -1; 
        }
        
        return rest + 1; 
    }
    
    // Takes two strings and returns a string that is a woven verision of the other strings. 
    // if one string is longer, remaining characters are added to returning string
    public static String weave(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        else if (str1.equals("")) {
            return str2;
        }
        else if (str2.equals("")) {
            return str1;
        }
        else {
            char ch1 = str1.charAt(0);
            char ch2 = str2.charAt(0);

            String rest = weave(str1.substring(1), str2.substring(1));
            return "" + ch1 + ch2 + rest;
        }
          
    }

    // Takes a char and string and returns the index of the first occurence 
    // of the char in the string or -1 if the char isn't in the string 
    public static int indexOf(char ch, String str) { 
        return find(ch, str);
 
    }
    public static void main(String []args) {
        System.out.println(trim("    hello world    "));

    }
}