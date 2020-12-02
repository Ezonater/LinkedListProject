public class Node {
    private double data;
    private Node next;

    public Node(double data){
        this.data = data;
        this.next = null;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public boolean equals(Node other){
        return data==other.getData();
    }

    public String toString(){
        return "" + data;
    }
}
