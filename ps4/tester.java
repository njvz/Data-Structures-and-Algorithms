public class tester {


    public static StringNode convert(String s) { 
        if (s.length() == 0) {
            return null;
        }

        else {
            StringNode rest = convert(s.substring(1));
            return new StringNode(s.charAt(0), rest);
        }
    }


     /**
      * toUpperCase - converts all of the characters in the specified
      * linked-list string to upper case.  Modifies the list itself,
      * rather than creating a new list.
      */
      public static void toUpperCase(StringNode str) {   
        if (str == null) { 
            return;
        }
        str.ch = Character.toUpperCase(str.ch);
        toUpperCase(str.next);

     } 

     /**
      * length - iteratively determines the number of characters in the
      * linked-list string to which str refers
      */
      public static int length(StringNode str) {
        int count = 0;
        while (str != null) { 
            count++;
            str = str.next;
        }
        return count;
     }
     







    public static void main(String[] args) { 
      

        String s1 = "hello";
        String s2 = s1;
        String s3 = new String( "hello" );
        String s4 = "hello";
        String s5 = new String( "hello" );
        s1 = "hello world";
        
      
         System.out.println(s4==s2);
    }
    
}
