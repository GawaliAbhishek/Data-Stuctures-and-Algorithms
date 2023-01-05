class Patterns{
    public static void main(String[] args) {
       P1();
       System.out.println();
       P2();
       System.out.println();
       P3();
       System.out.println();
       P4();
       System.out.println();
       P5();
       System.out.println();
       P6();
       System.out.println();
       P7();
    }


    public static void P1() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void P2() {
        for(int i=5;i>=1;i--){
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
        }
    }

    public static void P3() {
        for(int i=1;i<=5;i++){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void P4() {
        for(int i=5;i>=1;i--){
           for(int s=1;s<=5-i;s++){
            System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println();
          
        }
    }

    public static void P5() {
        for(int i=1;i<=5;i++){
          for(int s=1;s<=5-i;s++){
            System.out.print(" ");
          }
          for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
          }
          System.out.println();
        }
    }

    public static void P6() {
        for(int i=5;i>=1;i--){
            for(int s=1;s<=5-i;s++){
              System.out.print(" ");
            }
            for(int j=5;j>=2*(5-i)-1;j--){
             System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void P7() {
        P5();
        System.out.println();
        for(int i=7;i>=1;i--){
            for(int s=1;s<=7-i;s++){
              System.out.print(" ");
            }
            for(int j=7;j>=2*(7-i)-1;j--){
             System.out.print("*");
            }

            System.out.println();
        }
    }
}