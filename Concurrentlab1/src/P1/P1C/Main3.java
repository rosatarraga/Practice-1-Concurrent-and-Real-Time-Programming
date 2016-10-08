/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P1.P1C;

import P1.P1B.T_PrintID;

/**
 *
 * @author davidperezpastor
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Thread thread0 = new Thread(new R_PrintID(0));
        thread0.start();
        
        Thread thread1 = new Thread(new R_PrintID(1));
        thread1.start();
        
        Thread thread2 = new Thread(new R_PrintID(2));
        thread2.start();
        
        Thread thread3 = new Thread(new R_PrintID(3));
        thread3.start();
        
        Thread thread4 = new Thread(new R_PrintID(4));
        thread4.start();
        
    }
    
}
