public class LargestAreaSubMatrix {
    //https://www.geeksforgeeks.org/maximum-size-rectangle-binary-sub-matrix-1s/

    public static void main(String[] args) {
        int array[][]={{1,1,0,1,1},
                        {1,1,1,1,1},
                        {0,1,1,1,1},
                        {1,1,1,1,1},
                        {1,0,1,1,1},
                        {1,1,1,1,1}};
                 solution(array);       
    }

    public static void solution(int arr[][]){
        int build[]=arr[0];
        int max=MaxiHIstogram.usingStack(build);
        for (int i = 1; i < arr.length; i++) {
           for(int j=0;j< build.length;j++){
                if(arr[i][j]==0)
                build[j]=0;
                else
                build[j]+=arr[i][j];
           }
           max=Math.max(max,MaxiHIstogram.usingStack(build));
        }
        System.out.println(max);
    }
}
