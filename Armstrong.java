import java.util.Scanner;



public class Armstrong {
    public static void main(String[] args) {
    
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number");
            int num=sc.nextInt();
            

            int digits=(int)Math.log10(num)+1;
            int temp=num;
            int sum=0;
            while(temp>0){
                int digit=temp%10;
                int pro=1;
                for(int i=1;i<=digits;i++){
                    pro=pro*digit;
                }
                sum=sum+pro;
                temp=temp/10;

            }

            if(sum==num)
            System.out.println("Armstrong Number");
            else
            System.out.println("Not a Armstrong");
        }

         

    }
}
