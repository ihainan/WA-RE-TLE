package TopologicalSort;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * https://leetcode.com/problems/course-schedule/
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int numVisited = 0;
        return numCourses == numCourses;
    }

    /* Runtime: 556 ms - 20% */
    public boolean canFinishSolutionOne(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || numCourses == 1) return true;
        int[] inDegrees = new int[numCourses];
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
        int numOfEdges = 0;

        // compute inDegrees
        for (int i = 0; i < prerequisites.length; ++i) {
            inDegrees[prerequisites[i][1]]++;
            numOfEdges++;
        }

        for (int i = 0; i < inDegrees.length; ++i) {
            if (inDegrees[i] == 0) queue.add(i);
        }

        while (queue.size() != 0) {
            int course = queue.remove();
            for (int i = 0; i < prerequisites.length; ++i) {
                if (prerequisites[i][0] == course) {
                    numOfEdges--;
                    inDegrees[prerequisites[i][1]]--;
                    if (inDegrees[prerequisites[i][1]] == 0) {
                        queue.add(prerequisites[i][1]);
                    }
                }
            }
        }
        return numOfEdges == 0;
    }
}
