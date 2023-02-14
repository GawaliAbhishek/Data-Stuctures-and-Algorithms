public class BitManipulation {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,2,3,1,4,4,82};
        System.out.println(findNonRepeating(arr));
    }

    public static void evenOdd(int a){
        if((a&1)==1)
        System.out.println("odd");
        else
        System.out.println("even");
    }

    // finding the ith bit
    public static int ithBit(int a,int i){
        int mask=1<<i;
        if((a&mask)!=0)
        return 1;
        else
      return 0;
        
    }

    // seting the ith bit
    public static int ithBitSet(int a,int i){
        int mask=1<<i;
        if((a|mask)!=0)
        return 1;
        else
      return 0;
        
    }

    // finding the non repating elemet in array where all elements are repating 2 time only
    public static int findNonRepeating(int []arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        return ans;
    }
}
