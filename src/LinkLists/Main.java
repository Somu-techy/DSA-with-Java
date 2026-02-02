package LinkLists;

public class Main {
    public static void main(String args[]){
        SingleLL list = new SingleLL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.anyInsert(60, 2);
        list.anyInsert(70, 3);
        list.anyInsert(80, 4);
        list.anyInsert(40, 6);
        list.anyInsert(50, 8);
        System.out.println(list.anyDelete(3));
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        
    }
}
