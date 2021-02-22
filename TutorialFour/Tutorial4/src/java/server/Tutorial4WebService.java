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
@WebService(serviceName = "Tutorial4WebService")
public class Tutorial4WebService {

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
        System.out.println("[SERVER] - Testing connection...");
        return true;
    }

    /**
     * Web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "add")
    public Double add(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - add (" + a + ", " + b + " )");
        return a + b;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiply")
    public Double multiply(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - multiply (" + a + ", " + b + " )");
        return a * b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplyWithException")
    public Double multiplyWithException(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) throws Exception {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - multiplyWithException (" + a + ", " + b + " )");
        return a * b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "substract")
    public Double substract(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - substract (" + a + ", " + b + " )");
        return a - b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "substractWithException")
    public Double substractWithException(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) throws Exception {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - substractWithException (" + a + ", " + b + " )");
        return a - b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divide")
    public Double divide(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - divide (" + a + ", " + b + " )");
        return a / b;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "addWithException")
    public Double addWithException(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) throws Exception {
        //TODO write your implementation code here:
        return a + b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divideWithException")
    public Double divideWithException(@WebParam(name = "a") Double a, @WebParam(name = "b") Double b) throws Exception, ArithmeticException {
        //TODO write your implementation code here:
        return a / b;
    }


}
