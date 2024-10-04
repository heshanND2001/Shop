package model;

/**
 *
 * @author User
 */
public class A {
    
    public static void main(String[] args) {
        int x = 10;
        
        class RunnablePatiya implements Runnable{
            @Override
            public void run(){
                System.out.println("Niyamai");
                System.out.println(x);
            }
        }
        
        RunnablePatiya rp = new RunnablePatiya();
        
        Thread t = new Thread(rp);
        t.start();      
    }
    
}
