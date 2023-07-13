package javaapplication19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JavaApplication19 {
    public static void main(String[] args) {
        
        try{
            File f = new File("C:\\Users\\Lab PC.DESKTOP-UHGHF66\\Documents\\NetBeansProjects\\hi.txt");

            Scanner sc = new Scanner(f);
            
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);                
            }                    
        
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    
}
