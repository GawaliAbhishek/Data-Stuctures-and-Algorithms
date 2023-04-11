public class PalindromeLikedList {
    
    public boolean isPalindrome(Node head) {

        if(head==null || head.next==null)
        return true;
        
        Node mid=findMid(head);
        Node list2=reverse(mid);

        while(head!=null && list2!=null){
            if(head.data!=list2.data)
            return false;

            head=head.next;
            list2=list2.next;
        }

        return true;

    }

    public Node findMid(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public Node reverse(Node head){
        if(head==null || head.next==null)
        return head;

        Node curr=head;
        Node prev=null;
        
        while(curr!=null){
            Node Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }

        return prev;
    }
}
