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
public class MinMaxTwoArray {
    
    public static void main(String[] args) {
        Integer[][] numbers={{4,5,6},{1,2,3}};
        System.out.println("Min: "+min(numbers));
        System.out.println("Max: "+max(numbers));
    }
    
    public static <E extends Comparable<E>> E min(E[][] list){
        E min=list[0][0];
        for(int i=0;i<list.length;i++){
            for(int j=0;j<=list.length;j++){
                if(list[i][j].compareTo(min)<0){
                    min=list[i][j];
                }
            }
        }
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
        E max=list[0][0];
        for(int i=0;i<list.length;i++){
            for(int j=0;j<=list.length;j++){
                if(list[i][j].compareTo(max)>0){
                    max=list[i][j];
                }
            }
        }
        return max;
    }
}
