
public class MyQueue{

 Node front;
 Node rear;


public MyQueue(){
front=null;
rear=null;
}

public void enqueue(int data){
    Node toadd=new Node(data);

    if(front==null){
        front=toadd;
        rear=toadd;
        return;
    }
    rear.next=toadd;
    rear=toadd;
}


public int dequeue(){
    if(front==null)
    return -1;

    int  data=front.data;
    front=front.next;
    return data;
}

public boolean isEmpty(){
    return front==null;
}



    @Override
    public String toString() {
        if(front==null)
        return "[]";
        else{
            Node temp=front;
            String toReturn="[";
            while(temp!=null){
               toReturn+=temp.data+",";
               temp=temp.next;
            }
            return toReturn+"]";
        }
    }


}