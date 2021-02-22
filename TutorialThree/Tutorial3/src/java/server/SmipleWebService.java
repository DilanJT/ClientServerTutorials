/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "SmipleWebService")
public class SmipleWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - Testing Connection");
        return true;
    }
    
    private void executeTest(){
        System.out.println("[CLIENT] - Executing Connection test");
        if(isConnected()){
            System.out.println("[CLIENT] - Server is connected, test can continue...");
        }else{
            System.out.println("[CLIENT] - Server is not connected, test has failed !");
        }
    }
}
