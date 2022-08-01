package listnode;

import java.util.List;

public class ListNodeUtils {

    public static ListNode arrayToListNode(int[] array){
        ListNode head = null;
        if (array == null) return head;
        if (array.length == 0) return new ListNode(0);
        ListNode result = null;
        for (int i = 0; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            if (i == 0){
                head = node;
                result = head;
            }else {
                head.next = node;
                head = node;
            }
        }
        return result;
    }

    public static void printNode(ListNode head){
//        if (head == null) System.out.println("null");
        ListNode node = head;
        while (node != null){
            System.out.print(node.val);
            System.out.print("->");
            node = node.next;
        }
        System.out.println("null");
    }
}
