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
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer> map = new HashMap<>();

        int pos = 0;
        ListNode temp = head;
        while(temp != null){

            if(map.containsKey(temp)){

                return temp;
            }
            map.put(temp,pos);

            temp = temp.next;
            pos++;
        }
        return null;
    }
}