package TopologicalSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CourseScheduleTwoTest {

    @Test
    public void testFindOrder() throws Exception {
        CourseScheduleTwo courseScheduleTwo = new CourseScheduleTwo();
        int[][] prerequisites = new int[][]{{1, 0}};
        assertArrayEquals(new int[]{0, 1}, courseScheduleTwo.findOrder(2, prerequisites));

        prerequisites = new int[][]{{1, 0}, {0, 1}};
        assertArrayEquals(null, courseScheduleTwo.findOrder(2, prerequisites));

        prerequisites = new int[][]{{0, 1}, {1, 2}, {2, 3}, {2, 4}, {3, 4}};
        System.out.println(Arrays.toString(courseScheduleTwo.findOrder(5, prerequisites)));

        prerequisites = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        System.out.println(Arrays.toString(courseScheduleTwo.findOrder(4, prerequisites)));
    }
}