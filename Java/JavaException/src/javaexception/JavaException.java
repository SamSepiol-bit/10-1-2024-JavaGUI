

package javaexception;

public class JavaException {

    
    public static void main(String[] args) {
        try {
            int[] mynumbers = {1,2,3};
        System.out.println(mynumbers[10]);
            
        }catch (Exception e) {
            System.out.println("No 10th index");
        }finally{
            System.out.println("Try index 2");
        }
        
        
        
        
        
        
        //int[] mynumbers = {1,2,3};
        //System.out.println(mynumbers[10]);
    }
    
}
