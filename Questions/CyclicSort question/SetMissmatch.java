
/*
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
 */
public class SetMissmatch {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {

        int ans[] = new int[2];
        int i = 0;
        while (i < nums.length) {
            int cor = nums[i] - 1;

            if (nums[cor] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[cor];
                nums[cor] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans[0] = nums[j];
                ans[1] = j + 1;
            }
        }
        return ans;

    }
}
