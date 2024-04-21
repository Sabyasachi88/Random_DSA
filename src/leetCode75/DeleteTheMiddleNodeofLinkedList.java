package leetCode75;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class ListNode {


    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static void main(String args[]){
       // System.out.print(deleteMiddle(new int[] {1,3,4,7,1,2,6}));

        //System.out.print(oddEvenList(new int[] {1,3,4,7,1,2,6}));

        System.out.print(reverseList(new int[] {1,3,4,7,1,2,6}));
    }



    public static ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode temp = head;


        while (temp != null){
            ListNode front = temp.next;
            temp.next = pre;
            pre = temp;
            temp = front;

        }
         return pre;

    }


    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;


        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next.next;

        }

        odd.next = evenHead;
        return head;
    }


    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        fast =head.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
