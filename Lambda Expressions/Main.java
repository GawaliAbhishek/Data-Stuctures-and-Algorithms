public class Main {

    public static void main(String[] args) {

        // ananomous class 1
        MyInter obj1 = new MyInter() {

            @Override
            public void greet() {
                // TODO Auto-generated method stub
                System.out.println("obj1 is used");

            }
        };

        // ananmous Class 2
        MyInter obj2 = new MyInter() {

            @Override
            public void greet() {
                // TODO Auto-generated method stub
                System.out.println("Obj2 is used");
            }

        };

        obj1.greet();
        obj2.greet();


        // using Lamba 

        MyInter obj3=()->System.out.println("Lambda1 is used");
        obj3.greet();


        // using lambda
        Sum sum= (a,b)->a+b;
        System.out.println(sum.sum(2, 2));

    }
}
