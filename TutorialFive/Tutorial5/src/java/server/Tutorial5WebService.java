/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "Tutorial5WebService")
public class Tutorial5WebService {
    
    ArrayList<TemparatureSample> samples = new ArrayList<>();

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
        System.out.println("[SERVER] - Testing connection");
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addSample")
    public Boolean addSample(@WebParam(name = "sample") server.TemparatureSample sample) throws Exception {
        
        
        if(sample == null) {
            throw new Exception();
        }
        
        System.out.println("[SERVER] - addSample(" + sample + ") to " + sample);
        samples.add(sample);
        System.out.println("[SERVER] - Now samples are " + samples);
        
        return true;
    }
    
    /**
     * Web service operation
     * @return
     */
    @WebMethod(operationName = "getNumberOfSamples")
    public Integer getNumberOfSamples() {
        System.out.println("[SERVER] - getNumberOfSamples()");
        return samples.size();
    }
    
    /**
     * Web service operation
     * @return
     */
    @WebMethod(operationName = "getMaximum")
    public TemparatureSample getMaximum() throws Exception {
        if(samples.isEmpty())
            throw new Exception();
        
        TemparatureSample max = new TemparatureSample();
        max = samples.get(0);
        for(int i = 0; i < samples.size(); i++) {
            if(samples.get(i).getValue() > max.getValue())
                max = samples.get(i);
            
        }
        
        return max;
    }
    
    /**
     * Web service operation
     * @return
     */
    @WebMethod(operationName = "getMinimum")
    public TemparatureSample getMinimum() throws Exception{
        if(samples.isEmpty())
            throw new Exception();
        
        TemparatureSample min = new TemparatureSample();
        min = samples.get(0);
        for(int i = 0; i < samples.size(); i++){
            if(samples.get(i).getValue() < min.getValue())
                min = samples.get(i);
        }
        
        return min;
    }
}
