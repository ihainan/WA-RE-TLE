package TopologicalSort;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * https://leetcode.com/problems/course-schedule-ii/
 */
public class CourseScheduleTwo {
    /* Runtime: 468 ms - 64.82% */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int order[] = new int[numCourses], outDrgrees[] = new int[numCourses];
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
        int edges = 0, index = 0;
        ArrayList<Integer>[] arcs = new ArrayList[numCourses];

        for (int i = 0; i < prerequisites.length; ++i) {
            edges++;
            outDrgrees[prerequisites[i][0]]++;
            if (arcs[prerequisites[i][1]] == null) arcs[prerequisites[i][1]] = new ArrayList<Integer>();
            arcs[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for (int i = 0; i < outDrgrees.length; ++i) {
            if (outDrgrees[i] == 0) queue.add(i);
        }

        while (queue.size() != 0) {
            int course = queue.remove();
            order[index++] = course;
            if (arcs[course] != null) {
                for (int inCourse : arcs[course]) {
                    outDrgrees[inCourse]--;
                    edges--;
                    if (outDrgrees[inCourse] == 0) queue.add(inCourse);
                }
            }
        }

        return edges == 0 ? order : new int[]{};
    }
}
