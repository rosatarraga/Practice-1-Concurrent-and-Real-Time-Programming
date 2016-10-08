/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P1.P1B;

/**
 *
 * @author davidperezpastor
 */
public class T_PrintID extends Thread {
    int ID;
    
    public T_PrintID(int id){
        this.ID=id;
    }
    public void run (){
        
        
        //Thread h = Thread.currentThread();
        
        for(int i=0; i<10; i++){
            
            System.out.println("ID= " + ID);
            
        }
    }
}
