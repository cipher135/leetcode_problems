package sol.main;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		SolveHere s = new SolveHere();
		
//		String in[] = {"flower","flow","flight"};
//		String out = s.longestCommonPrefix(in);
		
//		boolean out = s.isValid("()[]{}");
		
		/*
		LinkedList list = new LinkedList();
		ListNode list1 = list.createList(Arrays.asList(1, 2, 4));
		ListNode list2 = list.createList(Arrays.asList());
		ListNode head = s.mergeTwoLists(list1, list2);
		list.printLinkedList(head);
		*/
		
		int a[] = {8, 13, 15, 17, 18, 21, 23};
		int key = 27;
		/*
		int ind = s.search(a, key);
		if(ind == -1) System.out.println(key + " is not present in the list");
		else System.out.println(key + " is present at postion: " + ind);
		*/
		/*
		int ind = s.searchInsert(a, key);
		System.out.println(ind);
		*/
		
//		String out = s.addBinary("1010", "1011");
//		System.out.println(out);
		
		LinkedList ll = new LinkedList();
		ListNode list = ll.createList(Arrays.asList());
		ll.printLinkedList(s.deleteDuplicates(list));
		
		
		
	}

}
