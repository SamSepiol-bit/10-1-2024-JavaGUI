/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexception;

/**
 *
 * @author hnd
 */
public class Exception02 {
    
    static void checkAge(int age){
        if(age < 18){
          throw new ArithmeticException("Access denied");  
        }else{
            System.out.println("Access granted");
        }
        
    }
    
    public static void main(String[] args){
        checkAge(19);
    }
}
