/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l7;

import java.util.Scanner;

/**
 *
 * @author syaam
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyQueue<Character> stack1 = new MyQueue<>();
        MyQueue<Character> stack1copy = new MyQueue<>();
        MyQueue<Character> stack2 = new MyQueue<>();
        System.out.print("Enter a word not more than 15 characters: ");
        String input = s.nextLine();
        if(input.length() > 15 || input.length() == 0){
            System.out.println("Exceed word limit");
        }else {
            for(int i=0;i<input.length();i++){
                stack1.enqueue(input.charAt(i));
                stack1copy.enqueue(input.charAt(i));
            }
            while(!stack1.isEmpty()){
                stack2.enqueue(stack1.dequeue());
            }
            if(compare(stack1copy, stack2)){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }
    }
    
    public static boolean compare(MyQueue a, MyQueue b){
        while(!a.isEmpty()){
            if(a.dequeue().equals(b.dequeue())){
                return true;
            }else
               return false;
        }
        return false;
    }
}