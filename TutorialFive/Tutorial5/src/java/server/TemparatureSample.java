/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author DELL
 */
public class TemparatureSample {
    
    private Double value = null;
    
    public Double getValue() {
        return value;
    }
    
    public void setValue(Double value){
        this.value = value;
    }
    
    @Override
    public String toString(){
        return java.time.LocalTime.now() + " TemperatureSample{" + "value=" + value + "}";
    }
}
