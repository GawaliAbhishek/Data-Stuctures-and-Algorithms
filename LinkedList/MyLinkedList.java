public class MyLinkedList {

    Node head;
    ReverseLinkedList service=new ReverseLinkedList();
    public void insert(int value) {
        Node toadd = new Node(value);
        if (head == null){
            head = toadd;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = toadd;
    }

    public void PrintList() {
        if (head == null)
            return;

        Node temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.print("]");
    }




}
