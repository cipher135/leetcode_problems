package sol.main;

import java.util.List;

public class LinkedList {
	
	// create a LinkedList for the given List of Integers
	public ListNode createList(List<Integer> arrays) {
		ListNode head = null;
		ListNode temp = null;
		for(Integer val:arrays ) {
			ListNode node = new ListNode();
			node.val = val;
			node.next = null;
			if(head==null) {
				temp = head = node;
			}else {
				temp.next = node;
				temp = temp.next;
			}
		}	
		return head;
	}
	
	public void printLinkedList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
}
