/**
 * https://leetcode.com/problems/excel-sheet-column-title/ <br>
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String title = "";
        while(n > 0){
            int remainder = (n - 1) % 26;
            title = (String.valueOf((char)(remainder + 'A'))) + title;
            n = (n - 1) / 26;
        }
        return title;
    }

    public static void main(String[] args){
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        excelSheetColumnTitle.convertToTitle(1);
    }
}
