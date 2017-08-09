/**
 * Author: tianyi
 * Time: 2017/8/9
 * Question:（复杂度O(2n)都不行，也是醉了，看来只能用额外空间）输入一个链表，输出该链表中倒数第k个结点。
 * Source:剑指Offer
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.ArrayList;
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        ArrayList<ListNode> list=new ArrayList<>();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        int length=list.size();
        if(length<k||k==0)
            return null;
        ListNode node=list.get(length-k);
        return node;

    }
}
