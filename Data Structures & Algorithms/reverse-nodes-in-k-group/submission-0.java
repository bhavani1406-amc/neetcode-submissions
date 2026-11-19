class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while (curr != null) {
            ListNode nextNode = curr.next;
            stack.push(curr);

            if (stack.size() == k) {
                while (!stack.isEmpty()) {
                    ans.next = stack.pop();
                    ans = ans.next;
                }
            }
            curr = nextNode;
        }

        
        if (!stack.isEmpty()) {
            Stack<ListNode> st = new Stack<>();
            while (!stack.isEmpty()) {
                st.push(stack.pop());
            }
            while (!st.isEmpty()) {
                ans.next = st.pop();
                ans = ans.next;
            }
        }

        ans.next = null;
        return dummy.next;
    }
}