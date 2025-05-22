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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)return list1;
        if(list1==null)return list2;
        if(list2==null) return list1;
        ListNode currentRef = new ListNode(), first = currentRef;
        while(list1!=null && list2!=null){
            //if(!(list1.val!=0 && list2.val!=0))break;
            if(list1.val<list2.val){
                currentRef.next=new ListNode();
                currentRef=currentRef.next;
                currentRef.val=list1.val;
                list1=list1.next;
            }else if(list1.val>list2.val){
                currentRef.next=new ListNode();
                currentRef=currentRef.next;
                currentRef.val=list2.val;
                list2=list2.next;
            }else{
                currentRef.next=new ListNode();
                currentRef=currentRef.next;
                currentRef.val=list1.val;
                list1=list1.next;
                currentRef.next=new ListNode();
                currentRef=currentRef.next;
                currentRef.val=list2.val;
                list2=list2.next;
            }
        }
        //if(list1.val==0 && list2.val==0)return first;
        if(list1!=null){
            //if(list1.val!=0){
                currentRef.next=new ListNode();
                currentRef=currentRef.next;
                currentRef.val=list1.val;
                currentRef.next=list1.next;
            //}
        }
        else if(list2!=null){
            //if(list2.val!=0){
                currentRef.next=new ListNode();
                currentRef=currentRef.next;
                currentRef.val=list2.val;
                currentRef.next=list2.next;
            //}
        }
        return first.next;
    }
}