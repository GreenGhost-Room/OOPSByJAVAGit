class Thread2 extends Thread{
  public Thread2(String name){
   super(name);
}
public void run(){
    for(int i=0;i<6;i++){
        System.out.println("this thread contrucor thread(String name): "+i);
    }
    System.out.println("exit from Thread(String name)");
} 
}
class ThreadRunnable implements Runnable{

 public void run(){
    for(int i=0;i<6;i++){
        System.out.println("this thread contrucor thread(Runnable r): "+i);
    }
    System.out.println("exit from Thread(Runnable r)");
} 
    
}
public class ThreadConstructor {
    public static void main(String[] args) {
        Thread2 th=new Thread2("sawarni");  // Thread contructor Thread(String name)
        th.start();
        System.out.println("id of thread: "+th.getId());
        System.out.println("name of thread: "+th.getName());
        ThreadRunnable Bullet=new ThreadRunnable();
        Thread gun= new Thread(Bullet); // Thread constructor Thread(Runnable r)
        gun.start();

        
    }
    
}
