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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(ListNode root:lists){
            ListNode curr = root;
            while(curr!=null){
                pq.add(curr.val);
                curr = curr.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(!pq.isEmpty()){
            curr.next = new ListNode(pq.poll());
            curr = curr.next;
        }
        return dummy.next;
    }
}
