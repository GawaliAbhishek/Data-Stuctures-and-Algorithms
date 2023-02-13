
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    
private static List<Integer> collect;

public static void main(String[] args) {
    // create a list and filter the even number
    List<Integer> list=Arrays.asList(50,23,45,85,65,14,23,74,12,58,89,652,23);


    //with out stream
    List<Integer> even=new ArrayList<>();
    for (Integer integer : list) {
        if(integer%2==0)
        even.add(integer);
    }
    System.out.println(even);

    //Using Stream API
    // here filter method filters the stream and takes a predicate(function which returns boolean value)
    //.collect collects the all filtered elemets and Collectors.toList() converts them to list
   List<Integer> even2=list.stream().filter(i -> i%2==0).collect(Collectors.toList());
   System.out.println(even2);

   // numbers in list which are greater than 50
   List<Integer> greaterThan50=list.stream().filter(i->i>=50).collect(Collectors.toList());
   System.out.println(greaterThan50);

   // numbers in List given make a list having square of all numbers in list1
   List<Integer> nums=Arrays.asList(2,3,4,5,6,7);
   collect = nums.stream().map(i->i*i).collect(Collectors.toList());
   System.out.println(collect);

   // Sort Elements
   nums.stream().sorted().forEach(System.out::print);

   // min max
   System.out.println(nums.stream().min((x,y)->x.compareTo(y)).get() );
   System.out.println(nums.stream().max((x,y)->x.compareTo(y)).get());
}

}
