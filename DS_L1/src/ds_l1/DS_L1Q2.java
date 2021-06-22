/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syaam
 */
public class DS_L1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner in=new Scanner(new FileInputStream("text1.txt"));
            int num1;
            while (in.hasNextLine()){
                String[] input=in.nextLine().split(",");
                for(num1=0;num1<input.length;num1++){
                   System.out.print(input[num1]);
                }
                System.out.println("");
                System.out.println("Number of Characters: "+num1);
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DS_L1Q2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        try {
            Scanner in=new Scanner(new FileInputStream("text2.txt"));
            int num2, total=0;
            while (in.hasNextLine()){
                String[] input=in.nextLine().split("[, ]");
                for(num2=0;num2<input.length;num2++){
                   System.out.print(input[num2]+" ");
                   total+=input[num2].length();
                }
                System.out.println("");
                System.out.println("Number of Characters: "+total);
                total=0;
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DS_L1Q2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        try {
            Scanner in=new Scanner(new FileInputStream("text3.txt"));
            int num3, total=0;
            while (in.hasNextLine()){
                String[] input=in.nextLine().split("[; ]");
                for(num3=0;num3<input.length;num3++){
                   System.out.print(input[num3]+" ");
                   total+=input[num3].length();
                }
                System.out.println("");
                System.out.println("Number of Characters: "+total);
                total=0;
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DS_L1Q2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        try {
            Scanner in=new Scanner(new FileInputStream("text4.txt"));
            int num4, total=0;
            while (in.hasNextLine()){
                String[] input=in.nextLine().split("[123456789]");
                for(num4=0;num4<input.length;num4++){
                   System.out.print(input[num4]);
                   total+=input[num4].length();
                }
                System.out.println("");
                System.out.println("Number of Characters: "+total);
                total=0;
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DS_L1Q2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
