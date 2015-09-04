import java.util.Arrays;

/**
 * 验证一些小理论
 */
public class JustForTest {
    public String swap(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        return x + " " + y;
    }

    public static void functionTest(int arr[]){
        arr[0] = 1;
    }

    public static void main(String[] args) {
        int[] arr = {3};
        functionTest(arr);
        System.out.println(Arrays.toString(arr));
    }
}
