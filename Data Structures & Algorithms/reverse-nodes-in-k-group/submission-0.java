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

    //Length of LL
    public int Len(ListNode head){
         int c = 0;
        while(head != null){
           c++;
           head = head.next;
        }
        return c;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int N = Len(head);
        int grp = N/k;  //groups

        ListNode ansNode = null;
        ListNode prevHead = null;
        ListNode currHead = head;
        for(int i = 0; i < grp; i++){
            ListNode prev = null;
            ListNode curr = currHead;
            ListNode nextNode = null;

            //Reverse in each group
            for(int j = 0; j < k; j++){
                nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            if(prevHead == null){
                ansNode = prev;
            }
            else{
                prevHead.next = prev;
            }
            prevHead = currHead;
            currHead = curr;
        }
        prevHead.next = currHead;  //incomplete nodes < k
        return ansNode;
    }
}