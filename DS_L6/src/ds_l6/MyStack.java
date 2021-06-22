/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l6;

/**
 *
 * @author syaam
 */
public class MyStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
       
    public void push(E O){
        list.add(O);
    }
    
    public E pop(){
        return list.remove(getSize()-1);
    }
    
    public E peek(){
        return list.get(getSize()-1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public String toString(){
        return list.toString();
    }
    
    public boolean search(E O){
        return list.contains(O);
    }
}
