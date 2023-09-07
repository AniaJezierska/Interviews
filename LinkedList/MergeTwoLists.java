public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // keep track of the head od the new list, and the tail to add on to
        ListNode head = new ListNode();
        ListNode tail = head;

        // iterate until we reach the end of one list
        while (list1 != null && list2 != null) {
            // compare the heads of both lists
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1 == null ? list2 : list1;

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoLists merge = new MergeTwoLists();
        ListNode result = merge.mergeTwoLists(l1, l2);

        printList(result);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}


