package sort;

import common.Interval;

import java.util.*;

/**
 * https://leetcode.com/tag/sort/
 */
public class MergeIntervals {
    private static class IntervalComparator implements Comparator<Interval> {

        @Override
        public int compare(Interval i1, Interval i2) {
            if (i1.start - i2.start != 0) return i1.start - i2.start;
            else return i1.end - i2.end;
        }
    }

    /* O(nlogn) - Runtime: 504 ms - 6.17% */
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

    /* Time Limit Exceeded */
    public List<Interval> mergeSolutionOne(List<Interval> intervals) {
        if (intervals.size() == 0 || intervals.size() == 1) return intervals;
        boolean isChange;
        while (true) {
            Collections.sort(intervals, new IntervalComparator());
            List<Interval> tmpList = new ArrayList<Interval>(intervals);
            isChange = false;
            for (int i = 0; i < tmpList.size() - 1; ++i) {
                Interval intervalOne = tmpList.get(i), intervalTwo = tmpList.get(i + 1);
                if (intervalOne.end >= intervalTwo.start && intervalTwo.end >= intervalOne.end) {
                    Interval newInterval = new Interval(intervalOne.start, intervalTwo.end);
                    intervals.remove(intervalOne);
                    intervals.remove(intervalTwo);
                    intervals.add(newInterval);
                    isChange = true;
                    break;
                }

                if (intervalTwo.end <= intervalOne.end) {
                    intervals.remove(intervalTwo);
                    isChange = true;
                    break;
                }
            }
            if (!isChange) break;
        }
        return intervals;
    }
}
