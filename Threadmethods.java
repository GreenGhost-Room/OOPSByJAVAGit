 class MyThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("Thank You");
            i++;
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
 }
 class MyThr2 extends Thread{
     public void run(){
         int i=0;
         while(i<30){
             System.out.println("My thank you");
             i++;
         }
     }
 }
public class Threadmethods {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1();
        MyThr2 t2=new MyThr2();
        t1.start();
     /*   try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }  */
        t2.start();
        
    }
    
}
