/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P1.P1D;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidperezpastor
 */
public class Hurry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.util.Random rand = new java.util.Random();
        
        int a=0;
        Lazy t = new Lazy();
        t.start();
        int  i;
        for (i = 0; i < 5; i++) {
            if (!t.isAlive()){
                break;
            }
            else {
                System.out.println("Aren't you ready yet?");
                try {
                    Thread.sleep(rand.nextInt(1000));
                } catch (InterruptedException ex) {
                    //Logger.getLogger(Hurry.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        if(i==5 && t.isAlive()){
            System.out.println("You are resting in your laurels... and I am leaving!");
            t.interrupt();
        }
        else System.out.println("At last, a turtle runs rings round you!");
    }
    
}
