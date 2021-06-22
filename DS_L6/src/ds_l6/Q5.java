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
public class Q5 {

    /**
     * @param args the command line arguments
     */
        public static int N;
        
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyStack<Integer> s1 = new MyStack<>();
        MyStack<Integer> s2 = new MyStack<>();
        MyStack<Integer> s3 = new MyStack<>();
        System.out.print("Enter how many disc in a rod: ");
        int numOfDisc = s.nextInt();
        for(int i=numOfDisc;i>0;i--){
            s1.push(i);
        }
        move(numOfDisc, s1, s2, s3);
    }
    
    public static void move(int n, MyStack<Integer> a, MyStack<Integer> b, MyStack<Integer> c){
        if (n > 0)
        {
            move(n-1, a, c, b);     
            int d = a.pop();                                             
            c.push(d);
            display(n, a, b, c);                   
            move(n-1, b, a, c);     
        }         
    }
    
    public static void display(int n, MyStack<Integer> a, MyStack<Integer> b, MyStack<Integer> c){
        for(int i=n;i>0;i--){
            System.out.println("ROD 1: "+a.toString());
            System.out.println("ROD 2: "+b.toString());
            System.out.println("ROD 3: "+c.toString());
            System.out.println("");
        }
    }
}
