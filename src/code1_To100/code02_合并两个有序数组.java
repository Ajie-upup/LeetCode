package code1_To100;

/**
 * @author ajie
 * @date 2023/3/7
 * @description: https://leetcode.cn/problems/merge-sorted-array/
 */
public class code02_合并两个有序数组 {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {4, 5, 6};
        int m = 3;
        int n = 3;
        merge(num1, m, num2, n);
    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        for (int k = m + n - 1; k >= 0; k--) {
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j])) {
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
        }
    }

    /**
     * 从最后一个元素开始添加
     *
     * @param nums1 第一个数组的空间大小为合并后的数组空间大小
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //存在当 nums1 有元素，m=0 的问题
        int total = m + n - 1;
        n = n - 1;
        m = m - 1;
        for (; total >= 0; total--) {
            if (m < 0 || n < 0) {
                break;
            }
            nums1[total] = nums2[n] > nums1[m] ? nums2[n--] : nums1[m--];
        }
        while (m >= 0) {
            nums1[total--] = nums1[m--];
        }
        while (n >= 0) {
            nums1[total--] = nums1[n--];
        }
    }
}
