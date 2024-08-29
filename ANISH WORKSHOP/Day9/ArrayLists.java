/*
Arraylist : Dynamic List

-Arraylist implement Lists
-Lists implements Collections
-Collections extends Iterable

- object[] is used to store objects
- if size is not enough newCapacity = (oldCapacity*3)/2+1
- Reduce if size is less than 1/4 to avoid race conditions
-ArrayList is generic 

*/
import java.util.ArrayList;
import java.util.List;
public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<String> characters = new ArrayList<>();
        characters.add("a");
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(0, 100);

        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        System.out.println(numbers);
        System.out.println(sum(numbers));

        
        System.out.println(characters);

        characters.remove(0);
        System.out.println(characters);

        List<List<Integer>> matrix = new ArrayList<>();  //2D list
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());
        matrix.get(0).add(1);
        matrix.get(0).add(10);

        System.out.println(matrix);
    }
    private static int sum(List<Integer> numbers){
        int result = 0 ;
        for(int elememt:numbers){
            result += elememt;
        }
        return result;
    }
}
