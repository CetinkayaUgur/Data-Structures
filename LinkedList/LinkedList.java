package LinkedList;

public class LinkedList {
    Node head = null;
    Node tail = null;

    public void show() {
        if (head == null) {
            System.out.println("Liste boş");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"==>");
            temp = temp.next;
        }
    }

    //Başa ekleme int
    public void addHead(int number) {
        Node newNode = new Node();
        newNode.data = number;

        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    //Baştan çıkarma
    public void deleteHead() {
        if (head == null) {
            System.out.println("Liste zaaaaten boş");
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    //Sona ekleme
    public void addTail(int number) {
        Node newNode = new Node();
        newNode.data = number;
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    //Sondan çıkarma
    public void deleteTail() {
        if (tail == null) {
            System.out.println("Boş listeden bişey çıkaramazsınız");
        }else{
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    //Araya ekleme
    public void addIndex(int number, int newNumber) {//number hangi sayıdan sonra araya eklemek istediğimizi belritiyor, newNumberda numberdan sonra hangi sayıyı eklemek istediğimizi belirtiyor.
        Node newNode = new Node(); //ekleyceğimiz node için oluşturduk 
        newNode.data = newNumber;
        
        if (head == null) {//boş mu diye bakıyoruz
            head = newNode;
            tail = newNode;
        }else{
            Node temp1 = head;//liste üzerinde ilerleyebilmek için oluşturduk
            Node temp2 = head;
            while (temp1.data != number) {
                temp1 = temp1.next;//ikiside sürekli aynı yerde ilerliyor
            }
            //Eklemek istediğimiz yere gelince temp2 yi bir adım daha öteliyoruz
            temp2 = temp2.next;
            temp1 = newNode;
            newNode.next = temp2;
        }
    }
    
    //Aradan çıkarma
}