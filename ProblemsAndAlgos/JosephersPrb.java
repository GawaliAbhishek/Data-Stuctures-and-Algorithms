
/*
 * https://www.geeksforgeeks.org/josephus-problem/
 * refer notes to get details of problem 
 */
class JosephersPrb{
    public static void main(String[] args) {
       int ans= Solution(3, 2);
       System.out.println(ans);
    }

    static int Solution(int n,int a){
        if(n==1){
            return 0;
        }
        return (Solution(n-1,a)+a)%n;
    }
}