import java.util.Arrays;

public class HeapSort {
    
    public static void main(String[] args) {
        int arr[]={-1,5,4,3,2,1};
            for(int i=(arr.length-1)/2;i>0;i--)
            hepify(arr,arr.length-1, i);

        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void Sort(int arr[]){

        for(int i=arr.length-1;i>0;i--){
            int temp=arr[1];
            arr[1]=arr[i];
            arr[i]=temp;
            hepify(arr,i-1, 1);
        }
    }

    private static void hepify(int arr[],int n,int i){
        int largest=i;
        int left=2*i;
        int right=2*i+1;

        if(left<=n)
        if(arr[left]>arr[largest])
        largest=left;

        if(right<=n)
        if(arr[right]>arr[largest])
        largest=right;

        if(largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            hepify(arr,n, largest);
        }
    }
}
