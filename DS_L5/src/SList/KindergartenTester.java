/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SList;

import java.util.Scanner;

/**
 *
 * @author syaam
 */
public class KindergartenTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kindergarten<String> studentList = new Kindergarten<>();
        
        System.out.println("Enter your students name list. Enter 'n' to end.");
        String input = "";
        while(!input.equals("n")){
            input = in.nextLine();
            if(input.equals("n"))
                continue;
            studentList.add(input);
        }
        
        System.out.println("You have entered the following students' name: ");
        studentList.printList();
        
        System.out.print("The number of students entered is: "+studentList.getSize()+"\n");
        
        System.out.println("All the names entered are correct? Enter 'r' to rename"
                + " the student name, 'n' to proceed.");
        String choice1 = in.nextLine();
        while(!choice1.equals("n")){
            if(choice1.equals("r")){
                System.out.print("Enter existing student name: ");
                String existingStudent = in.nextLine();
                System.out.print("Enter new student name: ");
                String newStudent = in.nextLine();
                studentList.replace(existingStudent, newStudent);
                System.out.println("The new student list: ");
                studentList.printList();
            }else{
                System.out.println("Wrong input");
            }
            System.out.println("Any more correction?");
            choice1 = in.nextLine();
        }
        
        System.out.println("Do you want to remove any of your student's name?"
                + " Enter 'y' if yes, 'n' to proceed.");
        String choice2 = in.nextLine();
        while(!choice2.equals("n")){
            if(choice2.equals("y")){
                System.out.print("Enter the name of student to be removed: ");
                String removeStudent = in.nextLine();
                studentList.removeElement(removeStudent);
                System.out.print("The number of updated student is: "+studentList.getSize()+"\n");
                System.out.println("The updated student list: ");
                studentList.printList();
            }else{
                System.out.println("Wrong input");
            }
            System.out.println("Any more removal?");
            choice2 = in.nextLine();
        }
        
        System.out.println("All student data captured. Thank you!");
    }
    
}
