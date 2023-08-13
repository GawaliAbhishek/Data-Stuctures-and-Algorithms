public class Pract3 {
    public static void main(String[] args) {
        int arr[]={123,45545,667545,321234,56753,23445234};
        System.out.println(Nums_with_even_number_of_digits(arr));
    }


    static int Nums_with_even_number_of_digits(int arr[]){
        int count=0;
        for (int i : arr) {
            int digits=(int)Math.log10(i)+1;
            if(digits%2==0)
            count++;
        }

        return count;
    }
}
