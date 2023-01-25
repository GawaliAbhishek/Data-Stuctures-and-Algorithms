

public class Basics {
    public static void main(String[] args) {
        int arr[]={1,3,2,1,4,2,4,3,0};
        System.out.println(FindNonReaptingNumber(arr));
    }

    // using bitwise And
    static boolean isEvenorOdd(int n){
        return (n&1)==0;
    }

    // suppose an array contains some numbers which are ocuured twice in array 
    // only one number in array is there which is occured once find that number

    // arr=[1,3,2,1,4,2,4] ans =3
    static int FindNonReaptingNumber(int arr[]){
        int ans=0;
        // Xor of all numbers of array the duplicate number will cancel each other
        // so remaing one will be the number which we want
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        return ans;
    }

}
