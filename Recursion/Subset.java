import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        List<List<Integer>> ans = getSubSetsDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> getSubSets(int arr[]) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;

    }

    // Removing the duplicate Subsets of given Array
    public static List<List<Integer>> getSubSetsDuplicate(int arr[]) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int j = 0; j < arr.length; j++) {
            if (j > 0 && arr[j] == arr[j - 1])
                start = end + 1;
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }
        return outer;

    }
}
