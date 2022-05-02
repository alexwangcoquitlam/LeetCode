package Easy.RemoveDuplicatesFromSortedList;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        // #83
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head != null){
            int temp = head.val;
            ListNode curr = head.next;
            ListNode prev = head;
            while(curr != null){
                if(curr.val == temp){
                    prev.next = curr.next;
                }
                else{
                    temp = curr.val;
                    prev = curr;
                }
                curr = curr.next;
            }
        }
        return head;
    }
}
