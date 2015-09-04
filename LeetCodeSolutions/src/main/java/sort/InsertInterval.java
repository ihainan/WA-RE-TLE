package sort;

import common.Interval;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/insert-interval/
 */
public class InsertInterval {
    /* O(nlogn) + O(n) - Runtime: 432 ms - 37% */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        return merge(intervals);
    }

    private static class IntervalComparator implements Comparator<Interval> {

        @Override
        public int compare(Interval i1, Interval i2) {
            if (i1.start - i2.start != 0) return i1.start - i2.start;
            else return i1.end - i2.end;
        }
    }


    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0 || intervals.size() == 1) return intervals;
        Collections.sort(intervals, new IntervalComparator());
        int i = 0;
        while (i != intervals.size() - 1) {
            Interval intervalOne = intervals.get(i), intervalTwo = intervals.get(i + 1);
            if (intervalOne.end >= intervalTwo.start && intervalTwo.end >= intervalOne.end) {
                Interval newInterval = new Interval(intervalOne.start, intervalTwo.end);
                intervals.remove(i + 1);
                intervals.set(i, newInterval);
                continue;
            } else if (intervalTwo.end <= intervalOne.end) {
                intervals.remove(intervalTwo);
                continue;
            }
            i++;
        }
        return intervals;
    }
}
