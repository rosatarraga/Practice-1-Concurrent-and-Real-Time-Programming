
package P1.P1B;

public class Main2 extends Thread {
    
    public static void main(String[] args) {
        
        Thread thread0 = new T_PrintID(0);
        thread0.start();
        
        Thread thread1 = new T_PrintID(1);
        thread1.start();
        
        Thread thread2 = new T_PrintID(2);
        thread2.start();
        
        Thread thread3 = new T_PrintID(3);
        thread3.start();
        
        Thread thread4 = new T_PrintID(4);
        thread4.start();
        
    }
    
}
