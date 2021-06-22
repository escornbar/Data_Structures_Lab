/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l7;

/**
 *
 * @author syaam
 */
public class Q1 {
    public static void main(String[] args) {
        String[] initial = {"Durian", "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(initial);
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println(fruitQ.toString());
        System.out.println("Peek: "+fruitQ.peek());
        System.out.println("Size: "+fruitQ.getSize());
        fruitQ.dequeue();
        System.out.println(fruitQ.getElement(2));
        System.out.println(fruitQ.contains("Cherry"));
        System.out.println(fruitQ.contains("Durian"));
        while(!fruitQ.isEmpty()){
            System.out.print(fruitQ.dequeue()+", ");
        }
    }
}
