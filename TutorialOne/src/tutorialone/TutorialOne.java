/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//This acts as a client
package tutorialone;

/**
 *
 * @author DELL
 */
public class TutorialOne {
    DummyServer server = new DummyServer("w1761267");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TutorialOne tutorialOne = new TutorialOne();
        tutorialOne.execute();
    }
    
    private void execute() {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println(server.testConnection("001"));
    }
    
    //TODO put the time stamps
}
