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
public class DS_L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        minmax(intArray);
        minmax(strArray);
    }
    
    public static <T extends Comparable<T>> void minmax(T[] a){
        T max=a[0];
        T min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(max)>0){
                max=a[i];
            }
        }
        
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(min)<0){
                min=a[i];
            }
        }
        System.out.println("Min = "+min+" Max = "+max);
    }
    
}
