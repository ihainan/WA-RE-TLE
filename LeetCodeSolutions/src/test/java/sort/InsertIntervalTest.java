package sort;

import common.Interval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InsertIntervalTest {

    @Test
    public void testInsert() throws Exception {
        InsertInterval insertInterval = new InsertInterval();
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(6, 9));
        intervals.add(new Interval(1, 3));
        assertEquals("[[1, 5], [6, 9]]", Arrays.toString(insertInterval.insert(intervals, new Interval(2, 5)).toArray()));

        intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(12, 16));
        intervals.add(new Interval(8, 10));
        assertEquals("[[1, 2], [3, 10], [12, 16]]", Arrays.toString(insertInterval.insert(intervals, new Interval(4, 9)).toArray()));
    }
}