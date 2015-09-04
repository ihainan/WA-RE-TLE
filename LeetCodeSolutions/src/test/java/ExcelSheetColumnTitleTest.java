import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSheetColumnTitleTest {

    @Test
    public void testConvertToTitle() throws Exception {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        assertEquals("A", excelSheetColumnTitle.convertToTitle(1));
        assertEquals("B", excelSheetColumnTitle.convertToTitle(2));
        assertEquals("Z", excelSheetColumnTitle.convertToTitle(26));
        assertEquals("AA", excelSheetColumnTitle.convertToTitle(27));
        assertEquals("AB", excelSheetColumnTitle.convertToTitle(28));
    }
}