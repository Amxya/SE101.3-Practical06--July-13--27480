package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1, 2, 3, 4, 5};
        
        try{
            int num = arr[10];
            System.out.println(num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index Out Of Bounds");
            
        }
        
    }
    
}
