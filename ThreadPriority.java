class ThreadPr1 extends Thread{
    public ThreadPr1(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("name of thread "+this.getName());
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        ThreadPr1 Pr1=new ThreadPr1("saw");
        ThreadPr1 Pr2=new ThreadPr1("dab(most Priority)");
        ThreadPr1 Pr3=new ThreadPr1("Tinu");
        ThreadPr1 Pr4=new ThreadPr1("maa(normal Priority)");
        ThreadPr1 Pr5=new ThreadPr1("papa");
        Pr2.setPriority(Thread.MAX_PRIORITY);
     //   Pr4.setPriority(Thread.NORM_PRIORITY);
        Pr1.start();
        Pr2.start();
        Pr3.start();
        Pr4.start();
        Pr5.start();
        
    }
    
}
