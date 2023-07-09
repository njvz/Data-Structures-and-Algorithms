/*
 * Nathan Van Zandt (nvz@bu.edu)
 *  
 * Practice with array recursion.
 */
public class ArrayRecursion {
    /* 
    * Takes an object, an object array, and an int. Returns
    * a boolean that indicates whether or not the object is in the array
    * starting from the int
    */
    public static boolean search(Object item, Object[] arr, int start) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        if (start == arr.length) {
            return false;
        }  
        else if (arr[start].equals(item)) {
            return true;
        }

        return search(item, arr, start + 1);
    }
    /* 
    * Takes an abject array and an int and returns a string representation of 
    * the array in reverse
    */
    public static String reverseArrayToString(Object[] arr, int index) {
        if (arr == null || index >= arr.length) {
            return "";
        }
        String e = "" + arr[index];
        String rest = reverseArrayToString(arr, index + 1);

        if (rest.length() == 0) {
            return "[" + e + "]";
        } 
        else {
            return rest.substring(0, rest.length() - 1) + ", " + e + "]";
        }
    }

    public static void main(String[] args) {
       

    }

}
