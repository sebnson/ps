/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode pointer1 = head; //1칸 이동
        ListNode pointer2 = head; //2칸 이동
        
        //cycle이 없는 경우
        if (head == null)
            return false;
        if (head.next == null)
            return false;
        
        //cycle이 있는 경우
        while(pointer2.next != null && pointer2.next.next != null){//두 칸이 연속으로 null인 경우
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
            
            if(pointer1 == pointer2){
                return true;
            }            
        }
        return false;

    }
}