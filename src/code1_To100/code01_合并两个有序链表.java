package code1_To100;


import java.util.List;

/**
 * @author ajie
 * @date 2023/3/7
 * @description: https://leetcode.cn/problems/merge-two-sorted-lists/description/
 */
public class code01_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode();

        ListNode cur = pre;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2 : list1;
        return pre.next;
    }
}
