import java.util.Vector;

public class VectorSearch {
    public static void main(String[] args) {
      
        Vector<String> vector = new Vector<>();

        
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");

        
        String searchElement = "C";

        
        if (vector.contains(searchElement)) {
            int index = vector.indexOf(searchElement);
            System.out.println(searchElement + " found at index: " + index);
        } else {
            System.out.println(searchElement + " not found in the vector.");
        }
    }
}
