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
public class TestLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList<Character> list1 = new MyLinkedList<>();
        list1.addFirst('a');
        list1.addLast('e');
        list1.add(1, 'b');
        list1.add(2, 'c');
        list1.add(3, 'd');
        list1.print();
        list1.reverse();
        System.out.println(list1.getSize());
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        list1.remove(list1.getSize()/2);
        list1.print();
        System.out.println(list1.indexOf('b'));
        System.out.println(list1.indexOf('c'));
        System.out.println(list1.contains('c'));
        list1.set(0, 'h');
        list1.set(1, 'e');
        list1.set(2, 'l');
        list1.set(3, 'l');
        list1.set(4, 'o');
        list1.print();
    }
    
}
