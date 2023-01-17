class Linear {
    public static void main(String[] args) {
        int arr[][]={{11,30,2,5},{7,8,5,9,10},{11,6,3,5,7}};
        System.out.println(MinimumIn2DArray(arr));
    }

    // Search in Array

    static int LinearSearch(int arr[], int key) {
        if (arr.length == 0)
            return -1;

        // search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    //Return The element

    
    static int LinearSearch2(int arr[],int key){
        if(arr.length==0)
        return Integer.MAX_VALUE;
        for (int i : arr) {
            if(i==key)
            return i;
        }
        return Integer.MAX_VALUE;
    }

    //return True or false
    static boolean LinearSearch3(int arr[],int key){
        if(arr.length==0)
        return false;
        for (int i : arr) {
            if(i==key)
            return true;
        }
        return false;
    }

    public static int Inrange(int arr[],int start,int end,int key) {

        if((start<0 || start>arr.length) || (end <0 || end >arr.length))
        return -1;
        for (int i = start; i < end; i++) {
            if(arr[i]==key)
            return i;
            
        }
        return -1;
    }


    public static int MaximumInArray(int arr[]) {

        if(arr.length==0)
        return Integer.MIN_VALUE;
           

        int max=Integer.MIN_VALUE;
        for(int num :arr){
            if(num>max)
            max=num;
        }
        return max;
        
    }


    public static int MinimuminArray(int arr[]) {
        
        if(arr.length==0)
        return Integer.MAX_VALUE;

        int min=Integer.MAX_VALUE;
        for(int num :arr){
            if(num<min)
            min=num;
        }
        return min;

    }


    public static void Searchin2DArray(int arr[][],int key) {
        if(arr.length==0)
        System.out.println("Invalid Array");

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key)
                System.out.println(i+" "+j);
            }
        }
        
        
    }

    public static int MaximumIn2DArray(int arr[][]) {
        if(arr.length==0)
        return Integer.MIN_VALUE;
int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j]>max)
                max=arr[i][j];
            }
        }

        return max;
    }
    public static int MinimumIn2DArray(int arr[][]) {
        if(arr.length==0)
        return Integer.MAX_VALUE;
int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j]<min)
                min=arr[i][j];
            }
        }

        return min;
    }
}

