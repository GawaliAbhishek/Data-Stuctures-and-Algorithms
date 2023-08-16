public class Pract5 {
    public static void main(String[] args) {
        printMessgae();
        System.out.println(Fibonacii(5));
    }

    static void printMessgae(){
        System.out.println("Hey");
    }

    // factorial
    static int fact(int value){
        if(value==1)
        return 1;

        return value * fact(value-1);
    }
   
    // fibonacii series
    static int Fibonacii(int value){
        if(value==0 || value==1)
        return value;

        return Fibonacii(value-1)+Fibonacii(value-2);
    }

    // 


}
