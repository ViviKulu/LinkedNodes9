package com.company;

public class Main {

    // Write the code necessary to convert the following sequence of ListNode objects:
    //
    // list -> [1] -> [2] /
    // Into this sequence of ListNode objects:
    //
    // list -> [1] -> [2] -> [3] /
    // Assume that you are using ListNode class as defined in the textbook:
    //
    // public class ListNode {
    //    public int data;       // data stored in this node
    //    public ListNode next;  // a link to the next node in the list
    //
    //    public ListNode() { ... }
    //    public ListNode(int data) { ... }
    //    public ListNode(int data, ListNode next) { ... }
    // }

    public static void main(String[] args) {
        // write your code here
        ListNode listNodeOne = new ListNode(1); //Create the first node to pass in the head (head node)
        listNodeOne.next = new ListNode(2); //Create the second node to pass in the current node's (head) next node (second node)
        listNodeOne.next.next = new ListNode(3); // Create the third node to pass in the current node's (head) next node (third node)

        LinkedIntList linkedIntList = new LinkedIntList("list");
        linkedIntList.add(listNodeOne.data);
        linkedIntList.add(listNodeOne.next.data);
        linkedIntList.add(listNodeOne.next.next.data);

        System.out.println(linkedIntList);
    }
}
