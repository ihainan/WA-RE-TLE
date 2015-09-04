package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortColorsTest {

    @Test
    public void testSortColors() throws Exception {
        SortColors sortColors = new SortColors();

        int[] arr = new int[]{1};
        sortColors.sortColors(arr);
        assertArrayEquals(new int[]{1}, arr);

        arr = new int[]{0, 1, 2, 2, 1, 0, 0, 1, 2};
        sortColors.sortColors(arr);
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2}, arr);

        arr = new int[]{};
        sortColors.sortColors(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testQSort() throws Exception {
        SortColors sortColors = new SortColors();
        int[] nums = new int[]{5, 4, 7, 3, 10, 2, 0};
        sortColors.qSort(nums, 0, nums.length - 1);
        assertArrayEquals(new int[]{0, 2, 3, 4, 5, 7, 10}, nums);
    }
}