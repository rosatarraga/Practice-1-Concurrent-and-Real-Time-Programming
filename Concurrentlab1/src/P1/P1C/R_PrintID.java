
package P1.P1C;

import P1.P1A.SequentialProgram;
import java.util.logging.Level;
import java.util.logging.Logger;

public class R_PrintID implements Runnable{
    
    java.util.Random rand = new java.util.Random();
    
    int ID;
    
    public R_PrintID(int id){
        this.ID=id;
    }
    public void run (){
        
        
        //Thread h = Thread.currentThread();
        
        for(int i=0; i<10; i++){
            
            System.out.println("ID= " + ID);
            
            try {
                    Thread.sleep(rand.nextInt(1000));
                } catch (InterruptedException ex){
                    Logger.getLogger(SequentialProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    }
    
}
