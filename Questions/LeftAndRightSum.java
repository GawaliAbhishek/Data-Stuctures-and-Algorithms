import java.util.Arrays;
//https://leetcode.com/problems/left-and-right-sum-differences/
public class LeftAndRightSum {
    public static void main(String[] args) {
        int arr[] = { 10, 4, 8, 3 };
        System.out.println(Arrays.toString(leftRigthDifference(arr)));
    }

    public static int[] leftRigthDifference(int[] nums) {

        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        int ans[]=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=nums[j];
            }
            leftsum[i]=sum;
        }

        for(int i=nums.length-1;i>=0;i--){
            int sum=0;
            for(int j=nums.length-1;j>i;j--){
                sum+=nums[j];
            }
            rightsum[i]=sum;
        }
        
        for(int k=0;k<ans.length;k++){
            ans[k]=Math.abs(leftsum[k]-rightsum[k]);
        }
        return ans;

    }
}
