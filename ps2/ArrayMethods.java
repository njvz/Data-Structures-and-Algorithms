/*  
 * Nathan Van Zandt (nvz@bu.edu)
 *  
 * A collection of methods used for practicing with arrays. 
 */
import java.util.*;
public class ArrayMethods {
    
    public static final String[] DAYS = 
    {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    /*  
     * takes a reference to an int array and swaps adjacent pairs of elements. If array is odd,
     * the last element is not moved 
     */
    public static void swapAdjacent(int[] values) {
        if (values == null) 
            throw new IllegalArgumentException(); 

        // makes a copy of values
        int[] valuesCopy = new int[values.length];
        for (int i = 0; i < valuesCopy.length; i++)
            valuesCopy[i] = values[i];

        if (values.length % 2 == 0) {
            for (int i = 0; i < values.length; i += 2) {
                values[i] = valuesCopy[i+1];
                values[i+1] = valuesCopy[i];
            }  
        } 
        else {
            for (int i = 0; i < values.length-1; i += 2) {
                values[i] = valuesCopy[i+1];
                values[i+1] = valuesCopy[i];
            }      

        }
    }
    /*  
     * takes a reference to an int array and two ints, oldVal and newVal returns new array
     * with all instances of oldVal replaced with newVal
    */ 
    public static int[] copyReplace(int[] values, int oldVal, int newVal) {
        if(values == null)
            throw new IllegalArgumentException(); 
        
        int[] valuesCopy = new int[values.length];

        for(int i = 0; i < values.length; i++) {
            if (values[i] == oldVal)
                valuesCopy[i] = newVal;
            else 
                valuesCopy[i] = values[i];
        }
        return valuesCopy;

    }

    // takes a reference to an int array and returns the length of the longest sorted sequence
    public static int maxSorted(int[] values) {
        if(values == null)
            throw new IllegalArgumentException();

        if(values.length == 0)
            return 0; 

        int counter = 1;
        int longest = 1;
    
        for (int i = 0; i < values.length-1; i++) {
                if (values[i] <= values[i+1]) {
                    counter++;
                    if (counter > longest) 
                        longest = counter;
                }
                else 
                    counter = 1;
            }

            return longest;
        }

    // takes in a string and returns the index of the string in class array DAYS
    public static int getIndexOfDay(String day){ 

        for (int i = 0; i < DAYS.length; i++) 
            if (DAYS[i].equalsIgnoreCase(day))
                return i;

        return -1;  
    }

    /* 
     * takes references to two int arrays and returns a reference to a 
     * third array that has the elements interchanged from a forward and reverse direction 
    */
    public static int[] reverseInterchange( int[] arr1, int [] arr2 ) {
        if (arr1 == null || arr2 == null) 
            throw new IllegalArgumentException(); 

        int arr3Length;
        // finds length of arr3
        if (arr1.length > arr2.length)
            arr3Length = arr2.length * 2;
        else if(arr2.length > arr1.length)
            arr3Length = arr1.length * 2;
        else 
            arr3Length = arr1.length; 

        int[] arr3 = new int[arr3Length]; 
        
        int arr1Counter = 0;
        int arr2Counter = arr2.length - 1;
        // assigns arr1 values
        for (int i = 0; i < arr3.length; i += 2) 
        {
            arr3[i] = arr1[arr1Counter]; 
            arr1Counter++;
        }
        // assigns arr2 values
        for (int i = 1; i < arr3.length; i += 2) 
        { 
            arr3[i] = arr2[arr2Counter];
            arr2Counter--;
        }

        return arr3;

    }


    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5,6};
        int a2[] = {10,11,12,13};
        System.out.println( Arrays.toString( ArrayMethods.reverseInterchange(a1, a2) ) );
        
    }

}
