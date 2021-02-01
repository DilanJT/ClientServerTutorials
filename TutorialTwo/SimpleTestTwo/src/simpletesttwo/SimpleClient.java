/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class SimpleClient {
    
    public SimpleClient() {
        System.out.println("[CLIENT] - Creating an instance of client...");
    }

    SimpleCalculatorServer server = new SimpleCalculatorServer();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO make sure to use time stamps also
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.executeTest();
    }
    
    
    private void executeTest() {

        
        System.out.println(timeStamp() + " - [CLIENT] - Testing if the server is connected...");
        
        if(server.isServerConnected()){
            System.out.println(timeStamp() + " - [CLIENT] - The client is connected, the test can proceed...");
            
//            Testing adding method
            System.out.println("\nadditon of 2 numbers");
            int x = 2;
            int y = 2;
            System.out.println(timeStamp() + " - [CLIENT] - Asking the server what is the sum of " + x + " and " + y);
            int z = server.addIntegerNumbers(x, y);
            System.out.println(timeStamp() + " - [CLIENT] - The server has replied that the sum of " + x + " and " + y + " is " + z);
            if(z == x + y)
                System.out.println(timeStamp() + " - [CLIENT] - The server has returned the same answer");
            else
                System.out.println(timeStamp() + " - [CLIENT] - The server has returned the wrong answer");
            
//            Testing divide method
            System.out.println("\ndivision of 2 numbers");
            x = 4;
            y = 3;
            System.out.println(timeStamp() + " - [CLIENT] - Asking the server what is the ratio of  " + x + " and "+ y );
            try {
                System.out.println(timeStamp() + " - [CLIENT] - Server says that " + x + " / " + y + " is " + server.divideIntegerNumbers(x, y) );
                
                //Result 1 is wrong, It should be with decimal points. That means methods return type should be a float type
            } catch (Exception ex) {
                System.out.println(timeStamp() + " - [CLIENT] - Exception Caught !!");
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, "Cannot divided by zero", ex);
            }
            System.out.println(timeStamp() + " - [CLIENT] - The server has replied that the ratio of " + x + " and " + y + " is " + z);
            
//            Testing the substract method
            System.out.println("\nsubstraction of 2 numbers");
            x = 5;
            y = 2;
            System.out.println(timeStamp() + " - [CLIENT] - Asking the server what is the difference between " + x + " and " + y);
            System.out.println(timeStamp() + " - [SERVER] - says that " + x + " - " + y + " is " + server.substractIntegerNumbers(x, y));
            
//            Testing the multiplication method
            System.out.println("\nmultiplication of 2 numbers");
            x = 4;
            y = 4;
            System.out.println(timeStamp() + " - [CLIENT] - Asking the server what is the answer " + x + " multiplied by " + y);
            System.out.println(timeStamp() + " - [SERVER] - says that " + x + "*" + y + " is " + server.multiplyIntegerNumbers(x, y));
            
//            Testing the array addition method
            System.out.println("\nAdding an array by another array");
            int[] j = new int[] {3,4,5};
            int[] k = new int[] {4,6, 5};
            System.out.println(timeStamp() + " - [CLIENT] - Asking the server what is the answer " + Arrays.toString(j) + " added to " + Arrays.toString(k));
            
            try{
                System.out.println(timeStamp() + " - [SERVER] - says that " + Arrays.toString(j) + "+" + Arrays.toString(k) + " is " + Arrays.toString(server.addIntegerArrayNumbers(j, k)));
            }catch(Exception ex){
                System.out.println(timeStamp() + " - [CLIENT] - Excepton caught!");
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, "Cannot add arrays with different sizes", ex);
            }
            
//            Testing the array division method
            System.out.println("\nDividing an array by another array");
            int[] p = new int[] {3,4,5};
            int[] q = new int[] {4,0, 5};
            System.out.println(timeStamp() + " - [CLIENT] - Asking the server what is the answer " + Arrays.toString(j) + " divided from " + Arrays.toString(k));
            
            try{
                System.out.println(timeStamp() + " - [SERVER] - says that " + Arrays.toString(j) + "/" + Arrays.toString(k) + " is " + Arrays.toString(server.divideIntegerArrayNumbers(p, q)));
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println(timeStamp() + " - [CLIENT] - Excepton caught!");
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, "Cannot divide arrays with different sizes", ex);
            }catch(ArithmeticException e) {
                System.out.println(timeStamp() + " - [CLIENT] - Excepton caught!");
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, "Cannot divide arrays from arrays which has zero.", e);
            }
            
        }else {
            System.out.println(timeStamp() + " - [CLIENT] - The client is not connected, the test has failed...");
        }
    }
    
    public String timeStamp() {
            DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String timeStamp = dateTimeFormat.format(now);
        
        return timeStamp;
    }
}
