import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(4);
        list.addLast(20);
        list.addLast(10);
        list.addFirst(6);
        list.remove(1);
        System.out.println(list);             // remove, contains, indexOf, toArray, size
    }
}
