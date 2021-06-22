/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SList;

/**
 *
 * @author syaam
 */
public class Node<E> {
    E element;
    Node<E> prev, next;

    public Node(E element) {
        this(element, null, null);
    }

    public Node(E element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
