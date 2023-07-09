/* 
 * Nathan Van Zandt (nvz@bu.edu) 
 *  
 * A program that finds the intersect of two arrays
 */
import java.util.*;
public class Problem8 { 

    /* 
     * Takes two arrays of integers and uses an approach based on  
     * merging to find and return the interection of the two arrays  
     * (all values found in both arrays).
     */
    public static int[] intersect(int[] a, int[] b) { 
        int length;
        if (a.length < b.length) {
            length = a.length; 
        }
        else { 
            length = b.length;
        }

        int[] c = new int[length]; 

        Sort.mergeSort(a); 
        Sort.mergeSort(b); 

        int i = 0;    // index into left subarray
        int j = 0;    // index into right subarray
        int k = 0;    // index into temp
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;       
            } 
            else if (b[j] < a[i]) { 
                j++;
            }
            else if (a[i] == b[j]) { 

                if (k == 0) { 
                    c[k] = a[i];
                    k++;
                }    
                else if (c[k-1] != a[i]) {
                    c[k] = a[i];
                    k++;
                }
         
            i++;
            j++;
               
            }
    }
    return c;
}

    public static void main(String[] args) { 

    int[] a1 = {10, 5, 7, 5, 9, 4};
    int[] a2 = {7, 5, 15, 7, 7, 9, 10};
    int[] result1 = intersect(a1, a2);
    System.out.println("result1: " + Arrays.toString(result1));

    int[] a3 = {0, 2, -4, 6, 10, 8};
    int[] a4 = {12, 0, -4, 8};
    int[] result2 = intersect(a3, a4);
    System.out.println("result2: " + Arrays.toString(result2));
    }

}