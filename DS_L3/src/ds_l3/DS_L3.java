/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l3;

import java.util.Arrays;

/**
 *
 * @author syaam
 */
public class DS_L3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        System.out.println("Bag1:");
        testAdd(bag1,contentsOfBag1);
        displayBag(bag1);
        System.out.println("");
        
        System.out.println("Bag2:");
        testAdd(bag2,contentsOfBag2);
        displayBag(bag2);
        System.out.println("");
        
        System.out.println("bag3, test the method union of bag1 and bag2:");
        ArrayBag<String> bag3 = bag1.union(bag2);
        displayBag(bag3);
        System.out.println("");
        
        System.out.println("bag4, test the method intersection of bag1 and bag2:");
        ArrayBag<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);
        System.out.println("");
        
        System.out.println("bag5, test the method difference of bag1 and bag2:");
        ArrayBag<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        for(int i=0;i<content.length;i++){
            aBag.add(content[i]);
            System.out.print(content[i] + " ");
        }
        System.out.println("");
    }
    
    private static void displayBag(BagInterface<String> aBag){
        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows:");
        System.out.println(Arrays.toString(aBag.toArray()));
        }
    }

