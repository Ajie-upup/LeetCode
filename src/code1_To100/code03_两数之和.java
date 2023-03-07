package code1_To100;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/3/7
 * @description: https://leetcode.cn/problems/two-sum/description/
 */
public class code03_两数之和 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    /**
     * 创建哈希表保存元素，空间换时间
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] finalTwoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            //如果哈希表中包含 target - nums[i] 这个元素就可以直接返回
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    /**
     * 采取遍历的方式查找元素
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }


    /**
     * 考虑使用一个 map 保存数组元素和下标的映射，但是存在[3,3]映射覆盖的问题
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        int[] ints = ArraySum(nums, target);
        return new int[]{hashMap.get(ints[0]), hashMap.get(ints[1])};
    }

    /**
     * 合并数组有序的时候
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] ArraySum(int[] nums, int target) {
        //如果数组无序，则会导致排序后的数组下标发生改变
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{nums[i], nums[j]};
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[2];
    }
}
