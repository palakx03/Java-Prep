import java.util.ArrayList;
import java.util.Arrays;        

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20); 
        list.add(30); 
        list.add(40);                          //remove, indexOf , lastIndexOf, toArray
        list.remove(1);
        System.out.println(list.indexOf(30));
        
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

        
        System.out.println(list);
    }
}
