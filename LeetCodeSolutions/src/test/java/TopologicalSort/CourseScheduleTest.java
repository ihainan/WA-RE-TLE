package TopologicalSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseScheduleTest {

    @Test
    public void testCanFinish() throws Exception {
        CourseSchedule courseSchedule = new CourseSchedule();
        int[][] prerequisites = new int[][]{{1, 0}};
//        assertEquals(true, courseSchedule.canFinish(2, prerequisites));
//
//        prerequisites = new int[][]{{1, 0}, {0, 1}};
//        assertEquals(false, courseSchedule.canFinish(2, prerequisites));

        prerequisites = new int[][]{{0, 1}, {1, 2}, {2, 3}, {4, 2}, {3, 4}};
        assertEquals(false, courseSchedule.canFinish(5, prerequisites));
    }
}