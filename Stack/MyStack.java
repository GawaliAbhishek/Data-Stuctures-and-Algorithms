public class MyStack {
    int arr[];
    int top;
    int size;

    public MyStack(int length){
        size=length;
        arr=new int[length];
        top=-1;
    }

    public void push(int data){
        top+=1;
        if(top<size && top>=0)
        arr[top]=data;
        else{
            System.out.println("Stack OverFlow");
        }
    }

    public int pop(){
        if(top>=0){
        int remove= arr[top];
        top-=1;
        return remove;
        }
        else
        return -1;
        
    }

    public int peek(){
        if(top>=0){
            return arr[top];
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        MyStack stack=new MyStack(5);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        System.out.println(stack.peek());

    }
}
