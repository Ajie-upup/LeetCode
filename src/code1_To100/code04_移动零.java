package code1_To100;

/**
 * @author ajie
 * @date 2023/3/7
 * @description: https://leetcode.cn/problems/move-zeroes/
 */
public class code04_移动零 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 8, 7, 0, 0};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
