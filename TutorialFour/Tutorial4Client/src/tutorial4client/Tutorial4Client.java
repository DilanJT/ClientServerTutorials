/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial4client;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.Exception_Exception;

/**
 *
 * @author DELL
 */
public class Tutorial4Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tutorial4Client client = new Tutorial4Client();
        client.execute();
    }

    private void execute() {
        System.out.println("[CLIENT] - Starting test...");
        
        if(isConnected()){
            System.out.println("[CLIENT] - Server is connected, test can proceed...");
            
            Double x = 2.0;
            Double y = 3.1;
            Double z = add(x, y);
            System.out.println("[CLIENT] - The server has returned: " + z + " = " + x + " + " + y);
            
            x = 2.0;
            y = 3.1;
            try{
                z  = addWithException(x, y);
                System.out.println("[CLIENT] - The server has returned: " + z + " = " + x + " + " + y);
            } catch (Exception_Exception e) {
                Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null , e);
            }
            

                
            x = 2.0;
            y = 3.1;
            z  = substract(x, y);
            System.out.println("[CLIENT] - The server has returned: " + z + " = " + x + " - " + y);
            
            x = 2.0;
            y = 3.1;
            try{
                z  = substractWithException(x, y);
                System.out.println("[CLIENT] - The server has returned: " + z + " = " + x + " - " + y);
            } catch (Exception_Exception e) {
                Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null , e);
            }

            x = 2.0;
            y = 3.1;
            z  = multiply(x, y);
            System.out.println("[CLIENT] - The server has returned: " + z + " = " + x + " * " + y);
            
            x = 2.0;
            y = 3.1;
            try{
                z  = multiplyWithException(x, y);
                System.out.println("[CLIENT] - The server has returned: " + z + " = " + x + " * " + y);
            } catch (Exception_Exception e) {
                Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null , e);
            }
            
            
            x = 2.0;
            y = 3.1;
            z  = divide(x, y);
            System.out.println("[CLIENT] - The server has returned: " + z + " = " + x + " / " + y);
            
            
            x = 0.0;
            y = 1.2;
            try{
                z  = divideWithException(x, y);
                System.out.println("[CLIENT] - The server has returned: " + z + " = " + x + " / " + y);
            } catch (Exception_Exception e) {
                Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null , e);
            } catch (ArithmeticException e){
                Logger.getLogger(Tutorial4Client.class.getName()).log(Level.SEVERE, null , e);
            }
            
            
            
                
        }
        else
        {
            System.out.println("[CLIENT] - Server is not connected, test failed !");
        }
        
        System.out.println("[CLIENT] - Test Completed...");
    }

    private static Boolean isConnected() {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.isConnected();
    }

    private static Double add(java.lang.Double a, java.lang.Double b) {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.add(a, b);
    }
    
//    IPC ( Inter-Process Communication
//    The IPC feature provides powerful asynchronomous and synchronomous communication sevices. IPC exports following basic commuication abstractions
//    - The unit of communication (message)
//    - Point to point commuication endpoints (port)
//    - Multicast commuication endpoints (groups)

    private static Double addWithException(java.lang.Double a, java.lang.Double b) throws Exception_Exception {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.addWithException(a, b);
    }

    private static Double substract(java.lang.Double a, java.lang.Double b) {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.substract(a, b);
    }

    private static Double substractWithException(java.lang.Double a, java.lang.Double b) throws Exception_Exception {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.substractWithException(a, b);
    }

    private static Double multiply(java.lang.Double a, java.lang.Double b) {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.multiply(a, b);
    }

    private static Double multiplyWithException(java.lang.Double a, java.lang.Double b) throws Exception_Exception {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.multiplyWithException(a, b);
    }

    private static Double divide(java.lang.Double a, java.lang.Double b) {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.divide(a, b);
    }

    private static Double divideWithException(java.lang.Double a, java.lang.Double b) throws Exception_Exception {
        server.Tutorial4WebService_Service service = new server.Tutorial4WebService_Service();
        server.Tutorial4WebService port = service.getTutorial4WebServicePort();
        return port.divideWithException(a, b);
    }

    
}
