/*
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */

public class MissingNumber {
 public static void main(String[] args) {
    
 }

    public int missingNumber(int[] nums) {
       
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]==nums.length){
                i++;
            }
            else if(correct!=i){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else
            i++;
        }
 
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j)
            return j;
        }
        return nums.length;
     }
    
}
