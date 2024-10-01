

package javaexception;

import java.util.Scanner;

//  method to devide 2 numbers
public class Exercise {
    public static int divide(int numerator, int denominator) throws ArithmeticException{
        if(denominator == 0){
           //here custorm exception it's call throw exception
            throw new ArithmeticException("Can nt devide by zero");
        }
        return numerator/denominator;
    }
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the numertor: ");
        int numertor = scanner.nextInt();
        
          System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        
        
        try {
           // try to devide numbers
            int result = divide(numertor, denominator);
            System.out.println("Result: "+result);
        } catch (ArithmeticException e) {
            //  handling divide by zero exception
            System.out.println("Error: "+ e.getMessage());
        }
        
        
    } 
    
}
