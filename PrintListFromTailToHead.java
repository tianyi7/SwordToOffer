/**
 * Author: tianyi
 * Time: 2017/7/31
 * Question:输入一个链表，从尾到头打印链表每个节点的值。
 * Source:剑指offer
 */
/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import java.util.ArrayList;
import java.util.Stack;
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Integer> s=new Stack<Integer>();

        if(listNode==null){
            return list;
        }
        if(listNode.next==null){
            list.add(listNode.val);
        }
        while(listNode!=null){
            s.push(listNode.val);
            listNode=listNode.next;
        }
        while(!s.isEmpty()){
            list.add(s.pop());
        }
        return list;
    }
}
