/*
 * Nathan Van Zandt (nvz@bu.edu)
 *  
 * A Set class with set related methods
 */
 public class Set  {
    private static final int SIZE = 10; // default size of initial set
                                
    private int[] set;      // array referece to the set
    private int size;       // current size of the set
    private int next;       // index to next available slot in the set array
    
    // Initializes this set with an empty set 
    public Set() {
        set = new int[SIZE];
        size = SIZE;
        next = 0;
    }
 
    // Takes in an int array and initializes this set with a non-duplicate  
    // copy of arr set 
    public Set(int[] arr) {
        this();

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }
    
    // Returns a copy of this set
    public Set clone() {
        Set setClone = new Set(set);
        return setClone;
    }

    // Takes an int and adds it to this set if the int isn't already    
    // in it. Resizes if needed
    public void insert(int k) {
        
            if(!member(k)){
                if (next == size) {
                    resize();
                }
                set[next] = k; 
                next++;
                }
                
    }

    /*  
     * This method reallocates the array set to twice as 
     * big and copies all the elements over.
     * This method is called only by the insert method
     * when it cannot insert another element to the set.
     *
     * Note that this is the reason that in this class
     * the member size is not a class variable (i.e. static)
     * and it is not final, because the set can grow and size
     * will be modified accordingly.
     */
    
     // Changes the set size
    private void resize() {
        size *= 2;

	// Create a new array double the size
        int[] temp = new int[size];

	// Copy all the elements from the current set
	// to the new set
        for(int i = 0; i < set.length; ++i) {
            temp[i] = set[i];
        }

	// Assign to the set reference the newly resized array that represents 
    // the set.
        set = temp;
    }

    // Returns a string representation of this set
    public  String toString()  {
        String s = "[";
        if (next == 0) {
            s += "]";
        } 
        else {
            for (int i = 0; i < next; i++){
                s += set[i]; 
                if (i != next-1)
                s += ",";
            }    
            s += "]";
        }
        return s;
              
        
    } 

    // Returns an int representing the number of elements in this set
    public int cardinality() {
        int count = 0;
        for (int i = 0; i < next; i++)
            count++; 
        return count;

    }

    // Returns a boolean representing whether or not this set is empty
    public boolean isEmpty() {
        if (next == 0)
            return true;
        else 
            return false;
    }
    // Takes an int and returns a boolean representing whether or not 
    // the int is in this set 
    public boolean member(int n) {
        boolean isIn = false; 
        for (int i = 0; i < size; i++){
            if (set[i] == n)
                isIn = true;         
        }

        return isIn;
        
    }    
    // Takes in a set and returns a boolean representing whether or not 
    // this set is a subset of it
    public  boolean subset(Set S) {
        for (int i = 0; i < next; i++) {
            if (!S.member(set[i]))
                return false;
        } 
        return true;
        

    }
    
    // Takes in a set and returns a boolean representing whether or not the
    // set and this set have the same elements
    public  boolean equal(Set S) {
        if(S.subset(this) && this.subset(S)) {
            return true; 
        }
        else 
            return false;
    }

    // Takes in an int and removes those ints from this set if 
    // they occur in this set
    public void delete(int k) {
        for (int i = 0; i < next; i++) {
            if (set[i] == k) {
                for (int x = i; x < next - 1; x++) {
                    set[x] = set[x + 1];
                }
                next--;
            }
           
        }
    }

    // Takes in a set and returns a new set consisting of all elements from 
    // the parameter set and this set without duplicates
    public Set union(Set S) {
        Set U = S.clone(); 

        for ( int i = 0;i < next;i ++) {
            U.insert(set[i]);
        }
        return U;
    }

    // Takes in a set and returns a new Set with elements that are common 
    // in both the parameter set and this set (without duplicates) 
    public Set intersection(Set S) {
        Set U = new Set();
        for (int i = 0; i < next; i ++) {
            if(S.member(set[i]))
            {
                U.insert(set[i]);
            }
        }
        return U;
    }

    // Takes in a set and returns a new set consisting of all the elements of this
    // set that are not present in the parameter set
    public Set setdifference(Set S) {
        Set U = new Set();
        for (int i = 0; i < next; i++){
            if (!S.member(set[i])){
                U.insert(set[i]);
            }
        }
        return U;
    }
     

}