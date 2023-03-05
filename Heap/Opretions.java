
import java.util.ArrayList;
import java.util.List;

public class Opretions {
    
    public static void main(String[] args) {
      
        List<Integer> list =new ArrayList<>();
        list.add(-1);
        list.add(50);
        list.add(40);
        list.add(45);
        list.add(30);
        list.add(20);
        list.add(35);
        list.add(10);
        insert(list, 60);;
        System.out.println(list);
    }

    public static void insert(List<Integer> arr,int n){
        arr.add(n);
        int i=arr.size()-1;
        
        while(i> 1){
            int p=i/2;
            if(arr.get(p)<arr.get(i)){
                int temp=arr.get(i);
                arr.set(i,arr.get(p));
                arr.set(p,temp);
                i=p;
            }
            else{
                return;
            }
        }
    }


   
}
