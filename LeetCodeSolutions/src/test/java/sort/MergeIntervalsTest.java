package sort;

import common.Interval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeIntervalsTest {

    @Test
    public void testMerge() throws Exception {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(6, 9));
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 5));
        assertEquals("[[1, 5], [6, 9]]", Arrays.toString(mergeIntervals.merge(intervals).toArray()));

        intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(12, 16));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(4, 9));
        assertEquals("[[1, 2], [3, 10], [12, 16]]", Arrays.toString(mergeIntervals.merge(intervals).toArray()));

        intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        assertEquals("[[1, 6], [8, 10], [15, 18]]", Arrays.toString(mergeIntervals.merge(intervals).toArray()));

        intervals = new ArrayList<Interval>();
        assertEquals(intervals, mergeIntervals.merge(intervals));
    }
}