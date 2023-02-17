/*
 * You are given a 0-indexed integer array nums.

The concatenation of two numbers is the number formed by concatenating their numerals.

For example, the concatenation of 15, 49 is 1549.
The concatenation value of nums is initially equal to 0. Perform this operation until nums becomes empty:

If there exists more than one number in nums, pick the first element and last element in nums respectively and add the value of their concatenation to the concatenation value of nums, then delete the first and last element from nums.
If one element exists, add its value to the concatenation value of nums, then delete it.
Return the concatenation value of the nums.
 */

public class ArrayConcatenation {
    public static void main(String[] args) {
        int arr[]={5,14,13,8,12};
        long ans=findTheArrayConcVal(arr);
        System.out.println(ans);
    }

    public static long findTheArrayConcVal(int[] nums) {
        long ans=0;
        int i=0;
        int j=nums.length-1;

        while(i<j){
           String s1=nums[i]+"";
           String s2=nums[j]+"";
           ans+=Long.parseLong(s1.concat(s2));
            i++;
            j--;
        }
        if(i==j)
        ans+=nums[i];

        return ans;


        
    }
}
