import java.util.Arrays;

/*
https://leetcode.com/problems/plus-one/
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {

 public static void main(String[] args) {
    int arr[]={9};
    System.out.println(Arrays.toString(plusOne(arr)));
 }
    public static int[] plusOne(int[] arr) {


        if(arr.length==1){
            arr[0]+=1;
            if(arr[0]==10){
                return new int[]{1,0};
            }
            return arr;
        }

       for(int i=arr.length-1;i>=0;i--){
        arr[i]+=1;
        if(arr[i]<=9){
            break;
        }
        arr[i]=arr[i]%10;
       }
       if(arr[0]==0){
        int ans[]=new int[arr.length+1];
        ans[0]=1;
        for (int i = 0; i < ans.length-1; i++) {
            ans[i+1]=arr[i];
        }
        return ans;
       }
       return arr;
    }
    
}
