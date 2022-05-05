package Medium.AddTwoNumbers;

public class AddTwoNumbers {
    public static void main(String[] args){
        // #2
        ListNode n15 = new ListNode(9);
        ListNode n14 = new ListNode(9, n15);
        ListNode n13 = new ListNode(9, n14);
        ListNode n12 = new ListNode(9, n13);
        ListNode n11 = new ListNode(9, n12);
        printList(n11);

        //ListNode n28 = new ListNode(9);
        //ListNode n27 = new ListNode(9, n28);
        //ListNode n26 = new ListNode(9, n27);
        ListNode n25 = new ListNode(9);
        ListNode n24 = new ListNode(9, n25);
        ListNode n23 = new ListNode(9, n24);
        ListNode n22 = new ListNode(9, n23);
        ListNode n21 = new ListNode(9, n22);
        printList(n21);

        ListNode head = addTwoNumbers(n11, n21);

        printList(head);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode head = l1;
        ListNode temp = new ListNode();
        while(l1 != null && l2 != null){
            temp = l1;
            if((l1.val = l1.val + l2.val + carry) >= 10){
                l1.val %= 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l2 != null){
            temp.next = l2;
            l1 = temp.next;
        }
        while(carry == 1){
            if(l1 == null){
                l1 = temp;
                ListNode newNode = new ListNode(1);
                l1.next = newNode;
                carry = 0;
            }
            else{
                l1.val = l1.val + carry;
            }

            if(l1.val < 10) carry = 0;
            else l1.val %= 10;

            if(l1.next == null && carry == 1){
                ListNode newNode = new ListNode(1);
                l1.next = newNode;
                carry = 0;
            }
            else{
                l1 = l1.next;
            }
        }
        return head;
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}
