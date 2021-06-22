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
public class Q2 {
    public static void main(String[] args) {
        permuteString("", "ABC");
    }
    
    public static void permuteString(String beginning, String ending){
        if(ending.length() == 1){
            System.out.println(beginning+ending);
        }else{
            for(int i=0;i<ending.length();i++){
                String newString = ending.substring(0, i)+ending.substring(i+1);
                permuteString(beginning+ending.charAt(i), newString);
            }
        }
    }
}
