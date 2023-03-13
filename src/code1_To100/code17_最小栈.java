package code1_To100;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/3/13
 * @description: https://leetcode.cn/problems/min-stack/
 */
public class code17_最小栈 {

    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        if (stack.peek() == null) {
            System.out.println("可以调用");
        }
    }

    /**
     * 栈顶元素为栈中元素的最小值
     * 1.开辟辅助栈的方法
     * 2.栈中存储 map 对象（不使用额外空间的办法）
     */
    class MinStack {

        Deque<Integer> xStack;
        Deque<Integer> minStack;

        public MinStack() {
            xStack = new LinkedList<>();
            minStack = new LinkedList<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            xStack.push(val);
            minStack.push(Math.min(minStack.peek(), val));
        }

        public void pop() {
            xStack.pop();
            minStack.pop();
        }

        public int top() {
            return xStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
