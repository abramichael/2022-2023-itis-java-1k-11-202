import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator; 

abstract class ArrayCollection<T> implements Collection<T> {
    private int capacity = 1000;
    private static final double LOAD_FACTOR = 0.75;
    private Object [] arr = new Object[capacity];
    private int n = 0;
    public boolean add(T x) {
        arr[n] = x;
        n++;
        return true;
    }
    private void checkAndResize() {    
        if (n > (capacity * LOAD_FACTOR)) {        
            System.out.println("Resize called");        
            capacity = (int) (capacity * LOAD_FACTOR) + capacity;        
            System.out.println("New size " + capacity);        
            Object [] arrNew = new Object[capacity];
            for (int i = 0; i < n; i++) {            
                arrNew[i] = arr[i];        
            }        
            arr = arrNew;
        }
    }
    public Object[] toArray() {
        // return arr; - нельзя
        Object [] arrNew = new Object[n];
        for (int i = 0; i < n; i++) {
            arrNew[i] = arr[i];
        }
        return arrNew;
    }
    public Iterator<T> iterator() {
        return new ArrayCollectionIterator<T>(arr, n);
    }
} 

class ArrayCollectionIterator<T> implements Iterable<T> {
    private Object [] elems;
    private int size;
    private int cursor;
    public ArrayCollectionIterator(Object [] elems, int size) {
        this.elems = elems;
        this.size = size;
        this.cursor = 0;
    }
    public boolean hasNext() {
        return cursor < size;
    }
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("atata!");
        }
        T value = (T) elems[cursor];
        cursor++;
        return value;
    }
} 

public class Main {
    public static void main(String [] args) {
	
        ArrayList<String> al = new ArrayList<>();
        al.add("Ernest");
        al.add("Danil");
        al.add("Egor");
        al.add("Kolya");
        al.add("Volodya");
        Iterator<String> i = al.iterator();
        String s = "| ";

        while (i.hasNext()) {
            String e = i.next();
            s = s + e + " | ";
            System.out.println(e);
        }

        System.out.println(s);
        String s = "| ";
        for (String e : al) {
            s = s + e + " | ";
            System.out.println(e);
        }
        
		//ArrayCollection<String> ac = new ArrayCollection<>();
		
    }
}