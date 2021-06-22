/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l4;

/**
 *
 * @author syaam
 */
public class MyLinkedList<E>{

        
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next  = head;
        head = newNode;
        size++;
        if(tail == null){
            tail = head;
        }
    }

    public void addLast(E e) {
        if (tail == null) { //no node exist
            head = tail = new Node<>(e);
        }
        else {
            tail.next = new Node<>(e); //tail.next point to new Node
            tail = tail.next; //new tail updated from tail.next
        }
        size++;
    }

    public void add(int index, E e) {
        if (index == 0) 
            addFirst(e); //since requested to add at index 0
        else if 
            (index >= size) addLast(e); //since requested to add at index=size
        else {
            Node<E> current = head; //set head to be a current node
            for (int i = 1; i < index; i++){ //traverse & stop before requested index
                current = current.next;
            }
            Node<E> temp = current.next; //hold reference current.next
            current.next = new Node<>(e); //current.next point to new node (refer α)
            (current.next).next = temp; //get the reference from temp (refer β)
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) 
            return null; // no node then return null
        else {
            Node<E> temp = head; // copy head to temp node before delete
            head = head.next; //set new head
            size--; //reduce size
            if (head == null) 
                tail = null; //in case of head=null
            return temp.element; //to know what we delete
        }
    }

    public E removeLast() {
        if (size == 0) 
            return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else{
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++){
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) 
            return null; // to delete index of node not in range
        else if (index == 0) 
            return removeFirst(); //call removeFirst
        else if (index == size - 1) 
            return removeLast(); //call removeLast
        else {
            Node<E> previous = head; //Set head to be previous
            for (int i = 1; i < index; i++) {
                previous = previous.next; // stop before index that want to be deleted
            }
            Node<E> current = previous.next; //copy previous.next to current
            previous.next = current.next; //set new point to from previous.next to current.next
            size--; //reduce size
            return current.element;
        }
    }
    
    public void add(E e){
        addLast(e);
    }
    
    public boolean contains(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++) { 
            if(current.element.equals(e)) {
                //System.out.println(current.element); 
                return true;
            }
            current = current.next; 
        } 
        return false;
    }
    
    public E get(int index){
        Node<E> current = head;
        if(size == 0){
            return null;
        }else {
            for(int i=0;i<index;i++){
                current = current.next;
            }
            return current.element;
        }
    }
    
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }
    
    public int indexOf(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current == null){
                return -1;
            }else if(current.element == e){
                return i;
            }else{
                current = current.next;
            }
        }
        return -1;
    }
    
    public int lastIndexOf(E e){
        if(size == 0){
            return -1;
        }else{
            Node<E> current = head;
            int temp = -1;
            for(int i=0;i<size;i++){
                if(current.element.equals(e)){
                    temp = i;
                }
                current = current.next;
            }
            return temp;
        }
    }
    
    public E set(int index, E e){
        if(size == 0){
            return null;
        }else if(index < 0 || index >= size){
            return null;
        }else {
            Node<E> current = head;
            for(int i=0;i<index-1;i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next.element = e;
            return temp.element;
        }
    }
    
    public void clear(){
        Node<E> current = head;
        while(current.next != null){
            current = current.next;
            removeFirst();
        }
        removeLast();
    }
    
    public void print(){
        Node<E> current = head;
        while (current != null){
            System.out.print(current.element+" ");
            current = current.next;
        }
        System.out.println("");
    }
    
    public void reverse(){
        for(int i=size-1; i >=0; i--){
            System.out.print(get(i)+" ");
        }
        System.out.println("");
    }

    public int getSize() {
        return size;
    }

}
