public class practice {

    // Remove the vowels in a string
    public static String removeVowel(String s) {
 
        if (s == null || s.equals("")) {
            return "";
        }
        else { 
            String rest = removeVowel(s.substring(1)); 
            if ("ieaou".indexOf(s.charAt(0))== -1) {
                return s.charAt(0) + rest;

            }
            else {
                return "" + rest;
            }
            
           
        }
           
    }
    // Cumpute the sum of integers in an array
    public static int sumArray (int[] a, int index) { 
        int sum = 0;
        if (index == 0){
            return a[0]; 
        }
        else { 
            sum = a[index] + sumArray (a,index-1);
            return sum;
        }
    }

    // Fibonacci, returns the ith number in a fibonacci sequence
    public static int fib(int i) { 
      
            int lim = 2;
            if( i < lim )
            return 1;
            else
            return fib(i-1) + fib(i-2);
    }

    // Takes a char and string and returns the index of the first occurence 
    // of the char in the string or -1 if the char isn't in the string
    public static int firstOccur(char ch, String s) { 
        if (s == null || s.equals("")) {
            return -1;
        }

        else if (s.charAt(0) == ch)  {
            return s.length()

        }

        int rest = firstOccur(ch, s.substring(1)); 

        
    }

    public static void main(String []args) {
       

System.out.println(fib(5));
    }
}
