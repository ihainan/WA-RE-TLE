import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSheetColumnNumberTest {

    @Test
    public void testTitleToNumber() throws Exception {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        assertEquals(excelSheetColumnNumber.titleToNumber("A"), 1);
        assertEquals(excelSheetColumnNumber.titleToNumber("C"), 3);
        assertEquals(excelSheetColumnNumber.titleToNumber("Z"), 26);
        assertEquals(excelSheetColumnNumber.titleToNumber("AA"), 27);
        assertEquals(excelSheetColumnNumber.titleToNumber("AB"), 28);
    }
}