/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P1.P1D;

import P1.P1A.SequentialProgram;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidperezpastor
 */
public class Lazy extends Thread{
    
    java.util.Random rand = new java.util.Random();
    
    public int r(){
        return (rand.nextInt(7)+2);
    }
    
    public void run(){
        int i=0;
        int k=0;
        int random = this.r();
        do{
            
            //System.out.println(rand.toString("I am dressing up...","Just a sec, please...","These clothes do not suit me..."));
            
            if(this.isInterrupted()) {
                break; 
            }
            int a = rand.nextInt(2);
            switch(a){
                case 0:
                    System.out.println("I am dressing up...");
                    break;
                case 1:
                    System.out.println("Just a sec, please...");
                    break;
                case 2:
                    System.out.println("These clothes do not suit me...");
                    break;
            }
            try {
                    Thread.sleep(rand.nextInt(1000));
                } catch (InterruptedException ex){
                    this.interrupt();
                }
            
            i++;
        }while(i<random);
        if(i==random && !this.isInterrupted()) System.out.println("I am ready, the early bird catches the worm!");
        else System.out.println("That's not cricket, please play the game.");
    }
    
}

