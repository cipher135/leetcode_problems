package sol.main;

import java.util.Stack;

public class SolveHere {
	
	// longest common prefix
	public String longestCommonPrefix(String[] strs) {
        int minl = 300;
        for(int i=0; i<strs.length; i++){
            if(minl > strs[i].length()){
                minl = strs[i].length();
            }
        }
        String pre = "";
        String p = strs[0];
        boolean match = true;
        for(int i=0; i<minl; i++){
            for(int j=1; j<strs.length; j++){
                if(p.charAt(i) != strs[j].charAt(i)){
                    match = false;
                    break;
                }

            }
            if(!match){
                break;
            }
            pre += p.charAt(i);
        }
        return pre;
    }
	
	// https://leetcode.com/problems/valid-parentheses/
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) { // for (char c : s.toCharArray())
			if (!st.isEmpty() && isPair(st.peek(), s.charAt(i))) {
				st.pop();
			} else {
				st.push(s.charAt(i));
			}
		}
		if (st.isEmpty())
			return true;
		return false;
	}
	boolean isPair(char c1, char c2) {
		if(c1 == '(' && c2 == ')')
			return true;
		if(c1 == '{' && c2 == '}')
			return true;
		if(c1 == '[' && c2 == ']')
			return true;
		return false;
	}

	//	https://leetcode.com/problems/merge-two-sorted-lists/
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = null;
		ListNode temp = null;
		while (list1 != null || list2 != null) {
			ListNode node = new ListNode();
			node.next = null;
			
			int bval, cval;
			if (list1 != null) {
				bval = list1.val;
			} else {
				bval = 111;
			}
			if (list2 != null) {
				cval = list2.val;
			} else {
				cval = 111;
			}
			if(bval < cval) {
				node.val = bval;
				list1 = list1.next;
			}else {
				node.val = cval;
				list2 = list2.next;
			}
			
			if(head==null) {
				temp = head = node;
			}else {
				temp.next = node;
				temp = temp.next;
			}
		}
		return head;
	}
	
	//	https://leetcode.com/problems/merge-k-sorted-lists/
	public ListNode mergeKLists(ListNode[] lists) {
		int k = lists.length;
        if(k==0) return null;
        if(k==1) return lists[0];
        
        ListNode list1 = lists[0];
        for(int i=0; i<k-1; i++) {
        	ListNode list2 = lists[i+1];
					list1 = mergeTwoLists(list1, list2);
        }
        return list1;
    }
	
	/*
	 * return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
	 * return haystack.indexOf(needle);
	 */
	
	//	https://leetcode.com/problems/search-insert-position/
	public int searchInsert(int[] nums, int target) {
		return binarySearchInsertPosition(nums, 0, nums.length-1, target);
	}
	private int binarySearchInsertPosition(int[] nums, int p, int r, int target) {
		if(p>r) return p;
		if(p<r) return r;
		int q = (p+r)/2;
		if(nums[q] == target) return q;
		if(target < nums[q]) binarySearchInsertPosition(nums, p, q, target);
		else binarySearchInsertPosition(nums, q+1, r, target);
		return -1;
	}
	
	public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    private int binarySearch(int[] nums, int low, int high, int k){
    	if(high-low < 0) return -1;
    	int out;
    	int mid = (low+high)/2;
    	if(k == nums[mid]) return mid;
    	if(k < nums[mid]) out = binarySearch(nums, low, mid-1, k);
    	else out = binarySearch(nums, mid+1, high, k);
    	return out;
    }
}