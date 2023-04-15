public class CycleInLInked {

    //https://leetcode.com/problems/linked-list-cycle-ii/solutions/3418889/java-easy-solution-beats-100/
    public Node hasCycle(Node head) {

        if(head==null || head.next==null)
        return null; 

        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            return slow;
        }
        return null;
    }

    public Node detectCycle(Node head) {
        Node cycle=hasCycle(head);
        Node temp=head;

        while(cycle!=null && temp!=null){
            if(cycle==temp)
            return temp;

            cycle=cycle.next;
            temp=temp.next;
        }
        return null;

    }

}
