import java.util.ArrayList;
import java.util.List;

/*
 * Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));

    }
    public static boolean isHappy(int n) {
        List<Integer> list=new ArrayList<>();

        while(n!=1){
         int square=0;

         while(n!=0){
             int dig=n%10;
             square+=dig*dig;
             n=n/10;
         }

        if(list.contains(square))
        return false;

        list.add(square);
        n=square;


        }

        return true;
    }     

}
