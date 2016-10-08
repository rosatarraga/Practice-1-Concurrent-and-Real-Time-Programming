/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P1.P1A;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paloma Cuenca Gil, David Pérez Pastor, Rosa Tárraga Moreno
 */
public class SequentialProgram extends Thread {
    
    public void run(){
        
        //we take thread's instance and change its name
        
        Thread h = Thread.currentThread();
        
        for(int a=0; a<=50; a++){
            if((a%2)!=0){
                System.out.println("odd " + a);
                System.out.println("thread: " + h.getName());
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex){
                    Logger.getLogger(SequentialProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
}
