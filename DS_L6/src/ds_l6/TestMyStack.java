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
public class TestMyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack<Character> s1 = new MyStack<>();
        System.out.println("Stack 1:");
        s1.push('a');
        s1.push('b');
        s1.push('c');
        System.out.println(s1.getSize());
        System.out.println(s1.toString());
        System.out.println(s1.search('b'));
        System.out.println(s1.search('k'));
        
        System.out.println("");
        
        MyStack<Integer> s2 = new MyStack<>();
        System.out.println("Stack 2:");
        s2.push(1);
        s2.push(2);
        s2.push(3);
        System.out.println(s2.toString());
        System.out.println(s2.search(6));
    }
    
}
