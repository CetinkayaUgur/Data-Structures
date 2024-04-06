package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList liste = new LinkedList();
        liste.addTail(4);
        liste.addTail(3);
        liste.addTail(2);
        liste.addTail(0);
        liste.addIndex(2,1);//3 den sonra 2 ekle
        liste.show(); // Output: 4 ==> 3 ==> 2 ==> ==> 0
    }           //                          t1         t2
}//                                               new