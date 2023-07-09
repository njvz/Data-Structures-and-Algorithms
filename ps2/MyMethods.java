/* 
 * Nathan Van Zandt (nvz@bu.edu)
 * 
 * A collection of methods created for practice with Strings. 
 */
public class MyMethods {

    
    // takes a string and prints decreasing substrings in decrements of one char
    public static void printDecreasing(String a) { 
        for (int i = a.length(); i > 0; i--)
        System.out.println(a.substring(0,i));
    }
    
    // takes a string and returns a new string combining the first and last char
    public static String firstAndLast(String str) {

        if (str.length() > 1)
        return "" + str.charAt(0) + str.charAt(str.length()-1); 

        else 
        return str;
    }

    // takes a string and char and returns the index of the last occurence of the char or -1
    public static int lastIndexOf(String str, char ch ){
        int lastIndex = -1;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch)
                lastIndex = i;
        
        return lastIndex;
    }

    // takes a string and an integer and returns a new string of n copies of the parameter string
    public static String repeat(String str, int n) {
        String result = "";

        for (int i = 1; i <= n; i++)
        result += str;

        return result;
    }

    public static void main(String[] args){
        System.out.println(repeat("oh!", 7)); 
    }
    
}
