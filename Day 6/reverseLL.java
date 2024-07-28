// 206. Reverse Linked List

// BruteForce -> we can store all the elements of an LL in a Stack(Which follows LIFO order by Default), 
// then we can restore all the values of the stack to a new LL... And return the new Head.

// Optimal Approach
public class reverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode back = null;

        while(current != null) {
            ListNode front = current.next;
            current.next = back;
            back = current;
            current = front;
        }

        return back;
    }    
}