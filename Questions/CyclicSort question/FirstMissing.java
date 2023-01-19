/*
 * Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
 */

public class FirstMissing {
  public static void main(String[] args) {
    
  }

    public int firstMissingPositive(int[] nums) {

        int i=0;
        while(i<nums.length){
            int cor=nums[i]-1;

            if(nums[i]>0&&nums[i]<=nums.length&&nums[cor]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[cor];
                nums[cor]=temp;
            }
            else
            i++;
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }

        return nums.length+1;
        
    }
    
}
