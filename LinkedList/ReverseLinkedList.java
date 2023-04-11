public class ReverseLinkedList {
    
    public Node Reverse(Node head){
        if(head==null || head.next==null)
        return head;

        Node curr=head;
        Node prev=null;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }

        return prev;

    }

// Reverse a Linked List using Recurrsion

    public Node ReverseRecurr(Node head){
        if(head==null || head.next==null)
        return head;

        Node newHead=Reverse(head.next);
        Node headNext=head.next;
        headNext.next=head;
        head.next=null;

        return newHead;
    }
}
