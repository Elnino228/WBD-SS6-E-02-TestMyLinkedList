public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList=new MyLinkedList<Integer>();
        myLinkedList.addFirst(0);
        myLinkedList.add(1,1);
        myLinkedList.add(2,2);
        myLinkedList.add(3,3);
        myLinkedList.add(4,4);


        myLinkedList.remove(4);

//        myLinkedList.add(0,1);
//        myLinkedList.add(1,2);
//        myLinkedList.add(2,3);
//        myLinkedList.add(3,4);

        System.out.println(myLinkedList.size());
        for (int i=0;i<myLinkedList.size();i++) {
            System.out.println(myLinkedList.get(i));
        }

    }
}
