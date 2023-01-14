package algorithm;

import datastructure.ListNode;
import junit.framework.TestCase;

public class SinglyCycleDetectionTest extends TestCase {
    SinglyCycleDetection singlyCycleDetection;

    public void setUp() throws Exception {
        super.setUp();
        singlyCycleDetection = new SinglyCycleDetection();
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

        assertTrue(singlyCycleDetection.hasCycle(head));
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

        assertFalse(singlyCycleDetection.hasCycle(head));
    }
}