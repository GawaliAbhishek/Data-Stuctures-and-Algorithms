import java.util.Scanner;

class OddEven{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the Number");
            int num=sc.nextInt();
      if(num%2==0)
      System.out.println("Even");
      else
      System.out.println("Odd");
        }
    }
}