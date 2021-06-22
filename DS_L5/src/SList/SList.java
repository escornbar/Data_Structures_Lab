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
public class SList<E> {
    
    private SNode<E> head;
    private SNode<E> tail;
    private int size;

    public SList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    public void appendEnd(E e){
        if(tail == null){
            head = tail = new SNode<>(e);
        }else {
            tail.next = new SNode<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public E removeInitial(){
        if(size == 0){
            return null;
        }else {
            SNode<E> temp = head;
            head = head.next;
            size--;
            if(head == null){
                tail = null;
            }  
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        SNode<E> current = head;
        for(int i=0;i<size;i++){
            if(current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }
    
    public void clear(){
        for(int i=0;i<=size;i++){
            head = head.next;
            size--;
        }
    }
    
    public void display(){
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
    
}
