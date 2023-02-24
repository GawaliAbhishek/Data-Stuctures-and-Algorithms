/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it can trap after raining.
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * 
 */
public class TrappedWater {

    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int auxleft[] = new int[height.length];
        int auxright[] = new int[height.length];

        int max = 0;
        for (int i = 0; i < auxleft.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
            auxleft[i] = max;
        }

        max = 0;

        for (int i = auxright.length - 1; i >= 0; i--) {
            if (height[i] > max) {
                max = height[i];
            }
            auxright[i] = max;
        }

        int maxtrapwater = 0;
        for (int i = 0; i < height.length; i++) {
            maxtrapwater += Math.min(auxright[i], auxleft[i]) - height[i];
        }

        return maxtrapwater;

    }
}
