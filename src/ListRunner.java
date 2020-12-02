public class ListRunner {
    public static void main(String[] args) {
        /*Box a = new Box(7);
        Box b = new Box(84);
        Box c = new Box(3);
        Box d = new Box(9);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        Box front = a;*/

        Node n1 = new Node(12.3);
        Node n2 = new Node(342);
        Node n3 = new Node(39.32);
        Node n4 = new Node(503.7);
        Node n5 = new Node(12.3);
        Node n6 = new Node(12.3);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);

        LinkedList list = new LinkedList(n1);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        list.add(3, n1.getData());
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        list.add(n2.getData());
        list.add(2038.63);
        System.out.println(list);
        list.remove(0);
        list.remove(1);
        list.remove(list.size()-1);
        System.out.println(list);
        list.remove(12.3);
        System.out.println(list);
        list.remove(503.7);
        System.out.println(list);

        LinkedList list2 = new LinkedList(n1);
        list2.add(12.3);
        list2.add(12.3);
        list2.add(12.3);
        list2.add(12.3);
        list2.add(12.3);
        System.out.println(list2);
        list2.deleteAll(12.3);
        System.out.println(list2);
    }
}
