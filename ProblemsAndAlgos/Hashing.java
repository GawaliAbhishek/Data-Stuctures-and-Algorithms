import java.util.HashSet;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        int arr[]={2,3,2,4,5,4,7,1};
        System.out.println(CountDistinct(arr));
    }

    // count distinct elements
    static int CountDistinct(int arr[]){
        Set<Integer> set=new HashSet<>();
        for(int e:arr)
        set.add(e);
        return set.size();
    }

    // given two Arrays Union the Arrays
    static int UnionSize(int arr1[],int arr2[]){
        Set<Integer> set=new HashSet<>();
        for(int e:arr1)
        set.add(e);
        for(int f:arr2)
        set.add(f);
        return set.size();
    }

    // Intersection of the two Arrays
    static int IntersectionSize(int arr1[],int arr2[]){
        Set<Integer> set=new HashSet<>();
        for(int e:arr1)
        set.add(e);
        int count=0;
        for(int f:arr2){
            if(set.contains(f)){
                count++;
                set.remove(f);
            }
        }
        return count;
    }
}
