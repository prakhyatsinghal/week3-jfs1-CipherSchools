class worker extends Thread{
    public void run(){
        System.out.println("Hi! I am Thread....");
    
    }
    
}
public class Test0 {
    public static void main(String args[]) {
     worker w1 = new worker();
     w1.start();

      
    }
}