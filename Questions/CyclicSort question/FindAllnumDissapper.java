import java.util.ArrayList;
import java.util.List;

/*
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
 */

public class FindAllnumDissapper {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else
                i++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1)
                list.add(j + 1);
        }
        return list;

    }
}
