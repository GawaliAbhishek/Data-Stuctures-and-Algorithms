
    import java.util.ArrayList;
import java.util.List;

public class Opretions {

    public static void main(String[] args) {
//-1,40,10,30,50,60,15
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(15);
        
      
        for(int i =(list.size()-1)/2;i>0;i--){
            heapify(list, i);
        }
        delete(list);
       
        System.out.println(list);
    }

    public static void insert(List<Integer> arr, int n) {
        arr.add(n);
        int i = arr.size() - 1;

        while (i > 1) {
            int p = i / 2;
            if (arr.get(p) < arr.get(i)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(p));
                arr.set(p, temp);
                i = p;
            } else {
                return;
            }
        }
    }


    private static void heapify(List<Integer> list,int i){
        int largest=i;
        int leftChild=i*2;
        int rightChild=i*2+1;

        if(leftChild<=list.size()-1)
        if(list.get(largest)<list.get(leftChild))
        largest=leftChild;

        if(rightChild<=list.size()-1)
        if(list.get(largest)<list.get(rightChild))
        largest=rightChild;

        if(largest!=i){
            int temp=list.get(i);
            list.set(i,list.get(largest));
            list.set(largest,temp);
            heapify(list, largest);
        }

        
    }


    public static void delete(List<Integer> list){
        list.remove(1);
        list.set(1,list.get(list.size()-1));

        for(int i=(list.size()-1)/2;i>0;i--){
            heapify(list, i);
        }
    }



}
