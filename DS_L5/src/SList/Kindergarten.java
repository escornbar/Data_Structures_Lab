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
public class Kindergarten<E> {
    
    private SNode<E> head;
    private SNode<E> tail;
    private int size; 

    public Kindergarten() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    public void add(E e){
        if(tail == null){
            head =  tail = new SNode<>(e);
        }else {
            tail.next = new SNode<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public void removeElement(E e){
        SNode<E> current = head;
        int index = 0;
        while(!current.element.equals(e)){
            current = current.next;
            index++;
        }
        if(index == 0){
            SNode<E> temp = head; 
            head = head.next;
            size--; 
            if (head == null) 
                tail = null;
        }else{
            SNode<E> previous = head; 
            for (int i = 1; i < index; i++) {
                previous = previous.next; 
            }
            current = previous.next; 
            previous.next = current.next; 
            size--; 
        }
    }
    
    public void printList(){
        SNode<E> current = head;
        while (current != null){
            System.out.print(current.element+" ");
            current = current.next;
        }
        System.out.println("");
    }

    public int getSize() {
        return size;
    }
    
    public boolean contains(E e){
        SNode<E> current = head;
        for(int i=0;i<size;i++){
            if(current.element.equals(e))
                return true;
        }
        return false;
    }
    
    public void replace(E e, E newE){
        SNode<E> current = head;
        int index = 0;
        while(!current.element.equals(e)){
            current = current.next;
            index++;
        }
        current.element = newE;
    }
}
