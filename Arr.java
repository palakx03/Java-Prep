import java.util.Arrays;
// public class Arr {
//     public static void main(String[] args) {
//         // int[] numbers = new int[5];
//         // System.out.println(numbers);

//         int[] numbers =  {10, 20, 30, 40, 50};
//         System.out.println(Arrays.toString(numbers));
//         System.out.println(numbers.length);
//     }
// }
 // Building an dynamic array by array class



public class Arr{
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        // numbers.removeAt(-1);
        System.out.println(numbers.indexOf(10));
        numbers.print();
    }
 }
