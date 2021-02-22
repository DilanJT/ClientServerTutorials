/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5client;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.Exception_Exception;
import server.TemparatureSample;

/**
 *
 * @author DELL
 */
public class Tutorial5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tutorial5Client client = new Tutorial5Client();
        client.execute();
    }
    
    public void execute(){
        
        System.out.println("[CLIENT] - starting test");
        
        if(isConnected())
        {
            System.out.println("[CLIENT] - Server is connected. Continuing test");
            TemparatureSample s = new TemparatureSample();
            s.setValue(0.1);
            try{
                addSample(s);
                System.out.println("[CLIENT] - Server has " + getNumberOfSamples() + " samples");
                System.out.println("[CLIENT] - Maximum sample on the server is " + getMaximum());
                System.out.println("[CLIENT] - Minimum sample on the server is " + getMinimum());
            }catch (Exception_Exception ex) {
                Logger.getLogger(Tutorial5Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            s.setValue(1.1);
            try{
                addSample(s);
                System.out.println("[CLIENT] - Server has " + getNumberOfSamples() + " samples");
                System.out.println("[CLIENT] - Maximum sample on the server is " + getMaximum());
                System.out.println("[CLIENT] - Minimum sample on the server is " + getMinimum());
            }catch (Exception_Exception ex) {
                Logger.getLogger(Tutorial5Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            s.setValue(-1.1);
            try{
                addSample(s);
                System.out.println("[CLIENT] - Server has " + getNumberOfSamples() + " samples");
                System.out.println("[CLIENT] - Maximum sample on the server is " + getMaximum().toString());
                System.out.println("[CLIENT] - Minimum sample on the server is " + getMinimum().toString());
            }catch (Exception_Exception ex) {
                Logger.getLogger(Tutorial5Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        {
            System.out.println("[CLIENT] - Server failed connect. test failed ! ");
            
            
            
        }
        System.out.println("[CLIENT] - Test completed");
    }

    private static Boolean isConnected() {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.isConnected();
    }

    private static Boolean addSample(server.TemparatureSample sample) throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.addSample(sample);
    }

    private static TemparatureSample getMaximum() throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getMaximum();
    }

    private static Integer getNumberOfSamples() {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getNumberOfSamples();
    }

    private static TemparatureSample getMinimum() throws Exception_Exception {
        server.Tutorial5WebService_Service service = new server.Tutorial5WebService_Service();
        server.Tutorial5WebService port = service.getTutorial5WebServicePort();
        return port.getMinimum();
    }
    
    
    
}
