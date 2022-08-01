package listnode;

public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode node = mergeTwoLists(ListNodeUtils.arrayToListNode(new int[]{1, 2, 4}), ListNodeUtils.arrayToListNode(new int[]{1, 3, 4}));
        ListNodeUtils.printNode(node);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode p1 = l1, p2 = l2;
        ListNode node = new ListNode(-1);
        ListNode head = node;
        while(p1 != null && p2 != null){
            ListNode temp = new ListNode(-1);
            if(p1.val < l2.val){
                temp.val = p1.val;
                p1 = p1.next;
            }else{
                temp.val = p2.val;
                p2 = p2.next;
            }
            node.next = temp;
            node = node.next;
        }
        if(p2 != null){
            node.next = p2;
        }
        if(p1 != null){
            node.next = p1;
        }
        return head.next;
    }
}
