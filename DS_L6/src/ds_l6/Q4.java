/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l6;

import java.util.Scanner;

/**
 *
 * @author syaam
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyStack<Character> stack1 = new MyStack<>();
        MyStack<Character> stack1copy = new MyStack<>();
        MyStack<Character> stack2 = new MyStack<>();
        System.out.print("Enter a word not more than 15 characters: ");
        String input = s.nextLine();
        if(input.length() > 15 || input.length() == 0){
            System.out.println("Exceed word limit");
        }else {
            for(int i=0;i<input.length();i++){
                stack1.push(input.charAt(i));
                stack1copy.push(input.charAt(i));
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            if(compare(stack1copy, stack2)){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }
    }
    
    public static boolean compare(MyStack a, MyStack b){
        while(!a.isEmpty()){
            if(a.pop().equals(b.pop())){
                return true;
            }else
               return false;
        }
        return false;
    }
}
