package code1_To100;

/**
 * @author ajie
 * @date 2023/3/10
 * @description: https://leetcode.cn/problems/sqrtx/
 */
public class code11_x的平方根 {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x / 2;
        int res = -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                res = mid;
                left = mid + 1;
            }
        }
        return res;
    }
}
