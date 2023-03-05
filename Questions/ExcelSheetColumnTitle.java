public class ExcelSheetColumnTitle {

    /*https://leetcode.com/problems/excel-sheet-column-title/description/
     * Given an integer columnNumber, return its corresponding column title as it
     * appears in an Excel sheet.
     * 
     * For example:
     * 
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * ...
     * 
     */
    public static void main(String[] args) {
            System.out.println(convertToTitle(28));
    }

    public static String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber > 0) {
            columnNumber--;
            ans = (char) ('A' + (columnNumber % 26)) + ans;
            
            columnNumber /= 26;
        }
        return ans;
    }

    
}
