import java.util.HashMap;
import java.util.Map;

/*
 * we are given with the array and the number which is sum
 * we have to find the subarray in given array which sums to the given number
 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={10,15,-5,15,-10,5};
        Solution(arr, 5);
    }
     

    static void Solution(int arr[],int sum){
       int cur=0;
       int s=0;
       int e=-1; 

       Map<Integer ,Integer> map=new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
        cur+=arr[i];
        if(cur-sum==0){
            s=0; e=i;
            break;
        }

        if(map.containsKey(cur-sum)){
            s=map.get(cur-sum)+1;
            e=i;
            break;
        }
        map.put(cur,i);
       }

       if(e==-1)
       System.out.println("Not Found");

       else{
        System.out.println("s = "+s+"e ="+e);
       }
    }
}
