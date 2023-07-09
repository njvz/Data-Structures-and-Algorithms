public class ArrayList implements List {

    private Object[] items;
    private int length;

    public ArrayList(int maxSize) {
    this.items = new Object[maxSize];
    this.length = 0;
    }

    public int length() {
        return this.length;
    }

    public boolean isFull() {
        return (this.length == this.items.length);
    }


    public boolean addItem(Object item, int i) {
        if (i < 0 || i > length) {
        throw new IndexOutOfBoundsException();
        } else if (isFull()) {
        return false;
        }
        // make room for the new item
        for (int j = length - 1; j >= i; j--) {
        items[j + 1] = items[j];
        }
        items[i] = item;
        length++;
        return true;
        } 

        public Object removeItem(int i) {
            if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException();
            }
            Object removed = items[i];
            // shift items after items[i] to the left
            for (int j = i; j < length - 1; j++) {
            items[j] = items[j + 1];
            }
            items[length - 1] = null;
            length--;
            return removed;
            }

            public Object getItem(int i) {
                if (i < 0 || i >= length) {
                throw new IndexOutOfBoundsException();
                }
                return items[i];
                } 

        public Object iterator() { 

            return null;
        }
    
    }
