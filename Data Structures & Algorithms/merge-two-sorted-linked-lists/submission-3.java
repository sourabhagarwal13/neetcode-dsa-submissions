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
        ListNode[] list = processNode(l3, l1, result);
        l3 = list[0];
        l1 = list[1];
        result = list[2];

      } else {
        ListNode[] list = processNode(l3, l2, result);
        l3 = list[0];
        l2 = list[1];
        result = list[2];
      }
    }
    while (l1 != null) {
      ListNode[] list = processNode(l3, l1, result);
      l3 = list[0];
      l1 = list[1];
      result = list[2];
    }
    while (l2 != null) {
      ListNode[] list = processNode(l3, l2, result);
      l3 = list[0];
      l2 = list[1];
      result = list[2];
    }
    return result;
  }

  private ListNode[] processNode(ListNode assigneeNode, ListNode assignedNode, ListNode result) {
    if (assigneeNode != null) {
      assigneeNode.next = new ListNode(assignedNode.val, null);
      assigneeNode = assigneeNode.next;
    } else {
      assigneeNode = new ListNode(assignedNode.val, null);
      result = assigneeNode;
    }
    assignedNode = assignedNode.next;
    return new ListNode[] {assigneeNode, assignedNode, result};
  }
}
