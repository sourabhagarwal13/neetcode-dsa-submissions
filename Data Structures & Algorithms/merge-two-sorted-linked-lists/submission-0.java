/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode l1 = list1;
    ListNode l2 = list2;
    ListNode l3 = null;
    ListNode result = null;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        if (l3 != null) {
          l3.next = new ListNode(l1.val, null);
          l3 = l3.next;
        } else {
          l3 = new ListNode(l1.val, null);
          result = l3;
        }

        l1 = l1.next;
      } else {
        if (l3 != null) {
          l3.next = new ListNode(l2.val, null);
          l3 = l3.next;
        } else {
          l3 = new ListNode(l2.val, null);
          result = l3;
        }

        l2 = l2.next;
      }
    }
    while (l1 != null) {
      if (l3 != null) {
        l3.next = new ListNode(l1.val, null);
        l3 = l3.next;
      } else {
        l3 = new ListNode(l1.val, null);
        result = l3;
      }
      l1 = l1.next;
    }
    while (l2 != null) {
      if (l3 != null) {
        l3.next = new ListNode(l2.val, null);
        l3 = l3.next;
      } else {
        l3 = new ListNode(l2.val, null);
        result = l3;
      }
      l2 = l2.next;
    }
    return result;
  }
}
