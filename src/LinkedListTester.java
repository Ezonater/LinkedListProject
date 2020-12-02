public class LinkedListTester
{
    public static void main(String [] args) {
        LinkedList list = null;
        System.out.println(list);
        list = new LinkedList();
        System.out.println(list);
        list.add(1.0);
        list.add(2.0);
        list.remove(0);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(1.0);
        list.add(2.0);
        list.remove(1);
        System.out.println(list);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        System.out.println(list);
        list.remove(3.0);
        list.add(5.5);
        list.remove(0);
        list.add(1, 3.6);
        System.out.println(list);
        System.out.println( list.size() );
        list.clear();
        System.out.println(list);
    }
}
