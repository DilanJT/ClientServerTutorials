/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial3client;

/**
 *
 * @author DELL
 */
public class Tutorial3Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tutorial3Client client = new Tutorial3Client();
        client.execute();
    }
    
    private void execute() {
        System.out.println("[CLIENT] - Starting test...");
        System.out.println("[CLIENT] - Test Completed !");
    }

    private static Boolean isConnected() {
        tutorial3client.SmipleWebService_Service service = new tutorial3client.SmipleWebService_Service();
        tutorial3client.SmipleWebService port = service.getSmipleWebServicePort();
        return port.isConnected();
    }

    private static String hello(java.lang.String name) {
        tutorial3client.SmipleWebService_Service service = new tutorial3client.SmipleWebService_Service();
        tutorial3client.SmipleWebService port = service.getSmipleWebServicePort();
        return port.hello(name);
    }
}
