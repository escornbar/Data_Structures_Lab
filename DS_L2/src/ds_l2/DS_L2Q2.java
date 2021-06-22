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
public class DS_L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyGeneric<String> strObj=new MyGeneric<>("Hello World");
        MyGeneric<Integer> intObj=new MyGeneric<>(10);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
    
}
