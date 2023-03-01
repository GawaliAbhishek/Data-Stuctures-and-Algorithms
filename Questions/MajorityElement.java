import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
    public static void main(String[] args) {
        
    }

    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int e:nums){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }
            else{
                map.put(e,1);
            }
        }
        for(Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==(nums.length/2))
            return e.getKey();
        }
        return -1;
    }

    /*
     * Maximum element occurs more than n/2 times thats why it is confirm it
     *  will be on mid after sorting array
     */
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
