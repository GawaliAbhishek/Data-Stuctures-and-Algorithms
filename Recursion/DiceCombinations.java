import java.util.ArrayList;

public class DiceCombinations {
    public static void main(String[] args) {
       System.out.println(DiceCombination2("",4));
    }

    // Ways to form a given number using dice
    public static void DiceCombination(String ans, int target) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            DiceCombination(ans + i, target - i);
        }

    }


    // Ways to form a given number using dice and returing ArrayList
    public static ArrayList<String> DiceCombination2(String ans, int target) {
        ArrayList<String> list =new ArrayList<>();
        if (target == 0) {
            list.add(ans);
            return list;
        }
     
        for (int i = 1; i <= 6 && i <= target; i++) {
           list.addAll(DiceCombination2(ans+i,target-i));
        }
        return list;

    }
}

