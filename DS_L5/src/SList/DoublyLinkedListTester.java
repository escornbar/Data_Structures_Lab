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
public class DoublyLinkedListTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(10);
        list.addLast(100);
        list.add(2, 2);
        list.remove(3);
        list.iterateForward();
        list.iterateBackward();
        System.out.println(list.getSize());
        list.clear();
        System.out.println(list.getSize());
    }
    
}
