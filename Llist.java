public class Llist {
    public static void main(String[] args) {
        var slist = new LinkedList();

        slist.addLast(10);
        slist.addLast(20);
        slist.addLast(30);
        slist.addLast(40);
        slist.addFirst(5);
        slist.addFirst(3);
        slist.addFirst(7);
        slist.removeFirst();
        slist.removeLast();
        System.out.println(slist.indexOf(30));
        System.out.println(slist.contains(60));
        slist.display();
    }
}
