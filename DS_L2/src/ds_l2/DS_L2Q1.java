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
public class DS_L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1
        StorePairGeneric<Integer> a=new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b=new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c=new StorePairGeneric<>(6,3);
        
        System.out.println(a.getFirst()+" "+displayCompare(a.compareTo(c))+" "+c.getFirst());  
        System.out.println(a.getFirst()+" "+displayEquals(a.equals(b))+" "+b.getFirst());  
    }
    
    public static String displayCompare(int signal){
        if(signal > 0){
            return ">";
        }else if(signal < 0){
            return "<";
        }else{
            return "==";
        }
    }
    
    public static String displayEquals(boolean signal){
        if(signal){
            return "==";
        }else{
            return "!=";
        }
    }
}
