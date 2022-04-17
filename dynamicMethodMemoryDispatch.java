class phone{
    public void showTime(){
        System.out.println("showing time");
    }
    public void on(){
        System.out.println("turning on the phone");

    }
}
class smartphone extends phone{
    @Override
    public void on(){
        System.out.println("turning on smartphone");
    }
    public void music(){
        System.out.println("playing music");
    }
}
public class dynamicMethodMemoryDispatch {
    public static void main(String[] args) {
      /*  smartphone sp=new smartphone();
        phone ph=new phone();
        ph.on();
        sp.on();
        sp.music();
        sp.showTime(); */
        phone obj1=new smartphone();
          //allowed obj1 is refrence and smartphone is object
       // smartphone obj2=new phone(); not allowed 
       obj1.on(); //it will run the on of smartphone class
     //  obj1.music(); it will not run music it belongs to subclass
       obj1.showTime();
        
    }
    
}
