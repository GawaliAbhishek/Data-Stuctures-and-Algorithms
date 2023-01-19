
import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Sort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void Sort1(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            boolean isSwap=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    isSwap=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            
            }
            // if it is already  sorted and no swap is taken in any pass hence stop program
            if(!isSwap)
            break;
        }
    }
}
