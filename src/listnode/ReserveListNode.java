package listnode;

public class ReserveListNode {

    public static void main(String[] args) {
        ListNode node = ListNodeUtils.arrayToListNode(new int[]{1,2,3,4,5});
        ListNodeUtils.printNode(node);
        ListNodeUtils.printNode(reverseList(node));
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode pre = head;
        ListNode curr = head.next;
        pre.next = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
