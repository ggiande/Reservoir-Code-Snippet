package leetcode;

import datastructure.ListNode;
import junit.framework.TestCase;

public class EasyLinkedListCycleDetectionTest extends TestCase {
    EasyLinkedListCycleDetection easyLinkedListCycleDetection;

    public void setUp() throws Exception {
        super.setUp();
        easyLinkedListCycleDetection = new EasyLinkedListCycleDetection();
    }

    public void testHasCycleWhenTrue() {

        // To populate linked list, create the new nodes (point to null)
        ListNode head = new ListNode(1);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);
        ListNode nodeD = new ListNode(4);
        ListNode nodeE = new ListNode(5);

        // Point to the nodes to each other
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeC;

        assertTrue(easyLinkedListCycleDetection.hasCycle(head));
    }

    public void testHasCycleWhenFalse() {
        // To populate linked list, create the new nodes (point to null)
        ListNode head = new ListNode(1);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);
        ListNode nodeD = new ListNode(4);
        ListNode nodeE = new ListNode(5);

        // Point to the nodes to each other
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        assertFalse(easyLinkedListCycleDetection.hasCycle(head));
    }
}