/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N = 0;
        ListNode curr = head;
        while(curr!=null){
            N++;
            curr = curr.next;
        }
        if(N==n) return head.next;
        curr = head;
        int node = N-n-1;
        for(int i = 0;i<node;i++){
           curr = curr.next; 
        }
        if (curr != null && curr.next != null) {
        curr.next = curr.next.next;
        }
        return head;
    }
}
