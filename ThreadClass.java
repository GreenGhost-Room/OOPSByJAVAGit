class MyThreadclass1 extends Thread{
  
    public void run(){
    for(int i=0;i<=5;i++){
        System.out.println("thread of A "+i);
    }
    System.out.println("exit from a");
}
}
class MyThreadclass2 extends Thread{
    public void run(){
    for(int i=0;i<=5;i++){
        System.out.println("thread of B "+i);
    }
    System.out.println("exit from b");
}


}
public class ThreadClass {
    public static void main(String[] args) {
        MyThreadclass1 mt=new MyThreadclass1();
        MyThreadclass2 my=new MyThreadclass2();
        mt.start();
        my.start();
        
    }
    
}
