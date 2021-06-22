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
public class Q1 {
    public static void main(String[] args) {
        System.out.println(replace("flabbergasted"));
        System.out.println(replace("Astronaut"));
    }
    
    public static String replace(String input){
      
        char x=input.charAt(0);
        if (input.charAt(0) == 'a')
        {
            x='i';
            input = 'i'+input.substring(1);
        }
        
        if (input.length() == 1){
            return input;
        }
        
        return x+replace(input.substring(1));
    }
}
