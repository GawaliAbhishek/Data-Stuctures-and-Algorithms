import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 10, 5, 6, 10, 8 };
        System.out.println(linearSearchArrayList2(arr, 10, 0));
    }

    // find if array is sorted or not
    // using recurssion
    static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1)
            return true;

        // is arr[i]<arr[i+1] And the further array is sorted
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }

    // linear Search by using recursion
    static boolean linearSearch(int arr[], int key, int index) {
        // if whole array is traversed then key not found return false;
        if (index == arr.length - 1)
            return false;
        // is arr[index]==key Or we find key in remaning array any one will be true
        // return will be true
        return arr[index] == key || linearSearch(arr, key, index + 1);
    }

    static int linearSearchIndex(int arr[], int key, int index) {
        // if whole array is traversed then key not found return -1;
        if (index == arr.length - 1)
            return -1;
        // if found return index
        if (arr[index] == key)
            return index;
        // else try to find it in remaing array
        else
            return linearSearchIndex(arr, key, index + 1);
    }

    // Returing an Arraylist of indexes where the number is occuured in array
    // in this case array will contain same element more than one time
    static ArrayList<Integer> linearSearchIndexArrayList(int arr[], int key, int index, ArrayList<Integer> list) {
        // if whole array has been traversed return list we have
        if (index == arr.length - 1)
            return list;

        if (arr[index] == key)
            list.add(index);

        return linearSearchIndexArrayList(arr, key, index + 1, list);

    }

    // What if the ArrayList is not Passed in Arguments

    static ArrayList<Integer> linearSearchArrayList2(int arr[], int key, int index) {
        // creating a new List at every Fucntion call
        ArrayList<Integer> list = new ArrayList<>();
        // array index out of bond return this list
        if (index == arr.length - 1)
            return list;
        // if ans found add it to the list
        if (arr[index] == key)
            list.add(index);
        // here is the main part we are adding the content of this list to the list
        // comming from further calls
        list.addAll(linearSearchArrayList2(arr, key, index + 1));
        // after adding the updated list is has been returned
        return list;
    }

}
