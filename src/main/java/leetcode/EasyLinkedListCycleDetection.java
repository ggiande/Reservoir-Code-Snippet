package leetcode;

import datastructure.ListNode;

import java.util.HashSet;

/**
 * 141. Linked List Cycle
 * The Cycle Detection Technique may use a recursive approach.
 *
 * @author ggiande
 */
public class EasyLinkedListCycleDetection {

    /**
     * Cycle Detection is a famous LeetCode question. This approach
     * traverses the linked lists and stores previously visited node values
     * that are unique and determines whether a cycle can be detected.
     *
     * @param head The Singly Linked List Node
     * @return boolean stating whether a cycle was found in the head
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode curr = head;
        HashSet<ListNode> set = new HashSet<>();

        // traverse through our linked list
        while (curr != null) {
            // search for the cycle
            if (set.contains(curr)) {
                return Boolean.TRUE;
            }
            // if not in cycle, then add it to the set
            set.add(curr);
            //advance the current node to the next
            curr = curr.next;
        }
        return false;
    }
}