/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class SimpleCalculatorServer {
    
    public String getTimeStamp() {
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String timeStamp = dateTimeFormat.format(now);
        return timeStamp;
    }
    
    public boolean isServerConnected() {
        
        System.out.println(getTimeStamp() + " - [SERVER] - Connection is being tested...");
        return true;
        
    }
    
    public int addIntegerNumbers(int a, int b) {
        System.out.println(getTimeStamp() + " - [SERVER] - Adding " + a + " and " + b);
        return a+b;
    }
    
    public int divideIntegerNumbers(int a, int b) throws Exception {
        
        if(b == 0)
            throw new Exception();
        
        if((b == 0) && (a == 0))
            throw new Exception();
        
        
        System.out.println(getTimeStamp() +" - [SERVER] - Divinding " + a + " with " + b + "...");
        return a/b;
    }
    
    public int substractIntegerNumbers(int a, int b) {
        System.out.println(getTimeStamp() +" - [SERVER] - Substracting " + a + " from " + b);
        return a - b;
    }
    
    public int multiplyIntegerNumbers(int a, int b) {
        System.out.println(getTimeStamp() +" - [SERVER] - Multplyinng " + a + " with " + b);
        return a*b;
    }
    
    public int[] addIntegerArrayNumbers(int[] a, int[] b) throws Exception {
        System.out.println(getTimeStamp() +" - [SERVER] - Adding " + Arrays.toString(a) + " with " + Arrays.toString(b));
        int size = a.length > b.length ? a.length : b.length;
        int[] result = new int[size];
        
        if(a.length != b.length)
            throw new Exception();
        
        for(int i = 0; i < size; i++) {
            result[i] = a[i] + b[i];
        }
           
            
        return result;
    }
    
    public int[] divideIntegerArrayNumbers(int[] a, int[] b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println(getTimeStamp() +" - [SERVER] - Dividing " + Arrays.toString(a) + " from " + Arrays.toString(b));
        int size = a.length > b.length ? a.length : b.length;
        int[] result  = new int[size];
        
        if(a.length != b.length)
            throw new ArrayIndexOutOfBoundsException();
        
        for(int i = 0; i < size; i ++){
            if(b[i] == 0)
                throw new ArithmeticException();
            
            result[i] = a[i] / b[i];
        }
        
       return result;
    }
    
}
