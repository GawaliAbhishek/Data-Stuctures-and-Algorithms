import java.util.Scanner;
// Palindrome numbers
public class Palindrome {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num =sc.nextInt();
            System.out.println("Number of digits in number is "+numofDigiit(num));
            System.out.println("Number of digits in number is "+shortrickfordigitinnumber(num));

           sumandproductofdigits(num);
           sumofevenandproductofeven(num);
            int rev=0;
            int temp=num;
      while(num>0){
            rev=(rev*10)+num%10;
            num=num/10;
      }
      if(rev==temp){
            System.out.println("Palindrome");
      }
      else
      System.out.println("Not Palindrome");
        }
        
    }



    public static int numofDigiit(int num){
        int count=0;
        while(num>0){
      
            num=num/10;
            count++;
        }
        return count;
    }

    public static void sumandproductofdigits(int num){
        int sum=0;
        int pro=1;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            pro=pro*digit;
            num=num/10;
        }

        System.out.println("Sum is "+sum);
        System.out.println("Product is "+pro);

    }


    public static void sumofevenandproductofeven(int num){
        
        int sum=0;
        int pro=1;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                sum=sum+digit;
            }
            else{
                pro=pro*digit;
            }
            num=num/10;
        }

        System.out.println("Sum of Even Number is "+sum);
        System.out.println("Product of Odd Number is "+pro);
    }


    public static int shortrickfordigitinnumber(int num){
        return (int) (Math.log10(num)) +1;
    }
}
