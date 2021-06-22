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
public class TestIntMyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyStack<Integer> s1 = new MyStack<>();
        System.out.print("Enter an integer: ");
        int val = s.nextInt();
        for(int i=1;i<=val;i++){
            s1.push(1);
        }
        System.out.println("Size: "+s1.getSize());
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
    
}
