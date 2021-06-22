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
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack<Integer> S = new MyStack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        int sum = 0;
        while(!S.isEmpty()){
            sum += S.pop();
        }
        System.out.println(sum);
    }
    
}
