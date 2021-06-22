/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l9;

/**
 *
 * @author syaam
 */
public class Q3 {
    public static void main(String[] args) {
        System.out.println(exponent(10, 3));
    }
    
    public static long exponent(int x, int y){
        if(y==0)
            return 1;
        if(y==1)
            return x;
        return x*exponent(x, y-1);
    }
}
