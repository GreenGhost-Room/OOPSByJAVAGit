abstract class Parent{
    public Parent(){
        System.out.println("i am default constructor");
    }
    abstract public void greet();
    abstract public void area();
}
class child extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void area(){
        int a=2,area;
        area=a*a;
        System.out.println("area; "+area);

    }
}
abstract class child2 extends Parent{
   /* @Override
    public void greet(){
        System.out.println("good to see you");
    }
    @Override
    public void area(){
        System.out.println("area");
    } */
    public void th(){
        System.out.println("jai ho");
    }
}
public class Abstractclass {
    public static void main(String[] args) {
         // Parent pc=new Parent(); abstract class ka object nhi ban sakta.
         child ch=new child();
         ch.area();
         ch.greet();
        /* child2 ch1=new child2(); yeh bhi ek abstract class hai so iska bhi object 
        sakta */
        /* parent pc=new child(); this is possible because we can 
        make refrence of abstract class */
        
        
    }
    
}
