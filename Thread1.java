class MyThreadRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<=6;i++){
            System.out.println("this is thread1: i "+i);
        }
        System.out.println("Exit from A: ");
    }

}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for(int j=0;j<=6;j++){
            System.out.println("this is thread2: j"+j);
        }
        System.out.println("exit from B: ");
    }
}
public class Thread1 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
        
    }
    
}
