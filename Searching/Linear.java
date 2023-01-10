class Linear {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 1 };
        System.out.println(LinearSearch2(arr, 4));
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
}