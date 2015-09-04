package DynamicProgramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testMinimumTotal() throws Exception {
        Triangle triangle = new Triangle();
        List<List<Integer>> triangleValue = new ArrayList<List<Integer>>();
        assertEquals(0, triangle.minimumTotal(triangleValue));
        List<Integer> line = Arrays.asList(2);
        triangleValue.add(line);
        assertEquals(2, triangle.minimumTotal(triangleValue));
        line = Arrays.asList(3, 4);
        triangleValue.add(line);
        line = Arrays.asList(6, 5, 7);
        triangleValue.add(line);
        line = Arrays.asList(4, 1, 8, 3);
        triangleValue.add(line);
        assertEquals(11, triangle.minimumTotal(triangleValue));
    }
}