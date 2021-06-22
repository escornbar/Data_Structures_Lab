/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;


/**
 *
 * @author syaam
 */
public class DS_L1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner in=new Scanner(new FileInputStream("SyaamilFaiq_17204215.txt"));
            while (in.hasNextLine()){
                String input=in.nextLine();
                System.out.println(input);
            }
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DS_L1Q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PrintWriter out=new PrintWriter(new FileOutputStream("SyaamilFaiq_17204215.txt", true));
            Scanner s=new Scanner(System.in);
            System.out.println("\nEnter your letter content:");
            String content=s.nextLine();
            out.println("\n"+content);
            out.close();
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
}
