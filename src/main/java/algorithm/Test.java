package algorithm;

/**
 * @Author: Rocky
 * @Date: 2019-12-15
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(f(-321));
    }

    public static int f(int x) {
        char[] arr = String.valueOf(Math.abs(x)).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return Integer.parseInt(x < 0 ? "-" + sb.toString() : sb.toString());
    }
}
