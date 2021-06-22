/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l2;

/**
 *
 * @author syaam
 */
public class CompareMax {
    
    public static <E extends Comparable<E>> E maximum(E a, E b, E c){
        if(a.compareTo(b)>0){
            if(a.compareTo(c)>0){
                return a;
            }
        }else if(b.compareTo(a)>0){
            if(b.compareTo(c)>0){
                return b;
            }
        }
        return c;
    }
}
