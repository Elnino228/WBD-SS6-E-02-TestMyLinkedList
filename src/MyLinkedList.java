

public class MyLinkedList<E> {
    private Node head;
    private int numNodes=0;

    public MyLinkedList() {
    }

    public void add(int index,E element) {
        if (numNodes==0) {
            head=new Node(element);
            numNodes++;
        } else {
            Node temp=head;
            for (int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node holder=temp.next;
            temp.next=new Node(element);
            temp.next.next=holder;
            numNodes++;
        }
    }
    public void addFirst(E element) {
            Node temp=head;
            head=new Node(element);
            head.next=temp;
            numNodes++;
    }
    public void addLast(E element) {
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNodes++;
    }
    public E remove(int index) {
        if (index==0) {
            head = head.next;
            numNodes--;
            return (E) head.getData();
        } else if (index==numNodes-1) {
            Node temp=head;
            for (int i=0;i<index-1;i++) {
                temp=temp.next;
            }
            temp.next=null;
            numNodes--;
            return (E)temp.getData();
        } else {
            Node temp=head;
            for (int i=0;i<index-1;i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            numNodes--;
            return (E)temp.next.getData();
        }
    }
    public boolean remove(Object o) {
        return true;
    }
    public int size() {
        return numNodes;
    }
    public MyLinkedList<E> clone() {
        MyLinkedList<E> myLinkedList=new MyLinkedList<E>();
        Node temp=head;
        for (int i=0;i<numNodes && temp!=null;i++) {
            myLinkedList.add(i,(E)temp.getData());
            temp=temp.next;
        }
        return myLinkedList;
    }
    public boolean contains(E element) {
        Node temp=head;
        while (temp!=null) {
            if (temp.getData()==element) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int indexOf(E element) {
        Node temp=head;
        int index=-1;
        for (int i=0;i<numNodes && temp!=null;i++) {
            if (temp.getData()==element) {
                index= i;
            }
            temp=temp.next;
        }
        return index;
    }
    public boolean add(E element) {
        return true;
    }
    public E get(int index) {
        Node temp=head;
        for (int i=0;i<index;i++) {
            temp=temp.next;
        }
        return (E)temp.getData();
    }
    public E getFirst() {
        return (E)head.getData();
    }
    public E getLast() {
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        return (E)temp.getData();
    }
    public void clear() {
        head=null;
        numNodes=0;
    }

}
class Node {
    public Node next;
    private Object data;

    public Node(Object data) {
        this.data=data;
    }
    public Object getData() {
        return data;
    }
}
