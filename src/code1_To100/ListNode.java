package code1_To100;

/**
 * @author ajie
 * @date 2023/3/7
 * @description: 创建单链表
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
