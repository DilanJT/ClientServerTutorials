/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//this acts as a server
package tutorialone;

/**
 *
 * @author DELL
 */
public class DummyServer {
    private String serverName;
    
    public DummyServer(String name){
        this.serverName = name;
    }

    //this function is mandatory => to debug
    String testConnection(String id) {
        System.out.println("DummyServer. Connection being started...");
        return "Server "+ this.serverName+": Connection from client:"+ id +" succeded";
    }
}
