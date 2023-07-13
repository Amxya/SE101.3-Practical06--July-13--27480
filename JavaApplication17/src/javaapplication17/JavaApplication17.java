
package javaapplication17;
import java.util.Scanner;

public class JavaApplication17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, y;
        
        System.out.println("Enter num 1: ");
        x = sc.nextInt();
            
        System.out.println("Enter num 2: ");
        y = sc.nextInt();
                    
        try {
            
            float z;
            z = x/y;
            System.out.println(z);
        }
        
        catch (ArithmeticException e){
            System.out.println("Divide by 0 error");
            

        }
        

        
    }
    
}
