public class LinkedList {
    private Node head;
    private int size;

    public String toString(){
        String nodeList = "[";
        Node nextNode = head;
        while(nextNode != null){
            if(nextNode.getNext() == null){
                nodeList += nextNode.getData();
            }
            else{
                nodeList += nextNode.getData() + ", ";
            }
            nextNode = nextNode.getNext();
        }
        return nodeList + "]";
    }

    public LinkedList(Node head){
        this.head = head;
        this.size = 0;
    }

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int size(){
        int size = 0;
        Node nextNode = head;
        while(nextNode != null){
            size++;
            nextNode = nextNode.getNext();
        }
        return size;
    }

    public void add(int index, double value){
        Node newNode = new Node(value);
        if(index==0){
            newNode.setNext(head);
            this.head = newNode;
        }
        else{
            newNode.setNext(this.get(index-1).getNext());
            this.get(index-1).setNext(newNode);
        }
    }

    public void add(double value){
        if(head != null){
            Node newNode = new Node(value);
            this.get(this.size()-1).setNext(newNode);
        }
        else{
            this.head = new Node(value);
        }
    }

    public Node get(int index){
        Node nextNode = head;
        for(int i = 0; i < index; i++){
            nextNode = nextNode.getNext();
        }
        return nextNode;
    }

    public void remove(int index){
        if(index==0){
            head = head.getNext();
        }
        else{
            this.get(index-1).setNext(this.get(index-1).getNext().getNext());
        }
    }

    public void remove(double value){
        Node nextNode = head;
        int index = 0;
        while(nextNode != null){
            if(nextNode.getData()==value){
                remove(index);
                break;
            }
            nextNode = nextNode.getNext();
            index++;
        }
    }
    public void printFirst(Node first){
        if (head != null || head.getData() != 7.0){
            System.out.println(head.getData());
        }
    }

    public void deleteAll(double value){
        Node current = head;
        Node previous = null;
        while (current != null){
            if(current.getData() == value){
                if(previous==null){
                    head = current.getNext();
                }
                else{
                    previous.setNext(current.getNext());
                }
            }
            else{
                previous = current;
            }
            current = current.getNext();
        }
    }

    public void clear(){
        this.head = null;
    }

    public boolean isEmpty(){
        return this.head == null;
    }
}
