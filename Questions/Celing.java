public class Celing {

    // celing of a given number is the number in array which is smallest in numbers 
    // which are greater than or equal to given number
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        System.out.println(celing1(arr, 4));
    }

    public static int celing1(int arr[],int key) {
        int s=0;
        int e=arr.length-1;
        int ans=Integer.MIN_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key)
            return arr[mid];

            if(arr[mid]>key){
                if(ans==Integer.MIN_VALUE)
                ans=arr[mid];

                if(ans>arr[mid])
                ans=arr[mid];
                e=mid-1;
            }
            else
            s=mid+1;
        }

        return ans;
    }


}
