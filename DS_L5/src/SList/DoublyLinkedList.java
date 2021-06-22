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
public class DoublyLinkedList<E> {
    private Node<E> head, tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addFirst(E element){
        Node<E> current = new Node(element, head, null);
        if(head != null){
            head.prev = current;
        }
        head = current;
        if(tail == null){
            tail = current;
        }
        size++;
        System.out.println("adding: "+element);
    }
    
    public void addLast(E element){
        Node<E> current = new Node(element, null, tail);
        if(tail != null){
            tail.next = current;
        }
        tail = current;
        if(head == null){
            head = current;
        }
        size++;
        System.out.println("adding: "+element);
    }
    
    public void add(int index, E element){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }else if(index == 0){
            addFirst(element);
        }else if(index == size){
            addLast(element);
        }else {
            Node<E> current = head;
            for(int i=0;i<index;i++){
                current = current.next;
            }
            Node<E> newNode = new Node(element, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
            System.out.println("adding: "+element);
        }
    }
    
    public void iterateForward(){
        System.out.println("iterating forward...");
        Node<E> current = head;
        while(current != null){
            System.out.print(current.element+" ");
            current = current.next;
        }
        System.out.println("");
    }
    
    public void iterateBackward(){
        System.out.println("iterating backward...");
        Node<E> current = tail;
        while(current != null){
            System.out.print(current.element+" ");
            current = current.prev;
        }
        System.out.println("");
    }
    
    public E removeFirst(){
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: "+current.element);
        return current.element;
    }
    
    public E removeLast(){
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+current.element);
        return current.element;
    }
    
    public E remove(int index){
        E element = null;
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }else if(index == 0){
            removeFirst();
        }else if(index == size-1){
            removeLast();
        }else{
            Node<E> current = head;
            for(int i=0;i<index;i++){
                current = current.next;
            }
            element = current.element;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
            size--;
            System.out.println("deleted: "+current.element);
        }
        return element;
    }
    
    public void clear(){
        Node<E> current = head;
        while(head != null){
            current = head.next;
            head.prev = head.next = null;
            head = current;
        }
        current = null;
        tail.prev = tail.next = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }
}
