import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the x");
            int x=sc.nextInt();
            System.out.println("Enter the y");
            int y=sc.nextInt();
            int pro=1;
            for(int i=0;i<y;i++){
               pro=pro*x;
            }
            System.out.println(x+"^"+y+" :"+pro);
        }

    }
}
