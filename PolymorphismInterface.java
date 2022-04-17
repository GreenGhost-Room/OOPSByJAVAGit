interface Mycellphone{
    public int x=9;
    public void Ringing();
    public void Picking();
    private void greet(){  // private method which i can't access directly 
                           //  in main method 
    System.out.println("good morning ");
    }
    default  void Rambharoshe(){  // default methods which which i don't want 
        greet();  //here we can access private greet  // implement in class 
        System.out.println("jai shree ram");
    }

}
interface Mysmartphone{
    public void Gps();
    public void wifi();
}
class Cellphone{
    int phoneNumber;
    public void calling(int number){
        System.out.println("calling: "+number);
    }
    public void videocall(){
        System.out.println("videocall: "+phoneNumber);
    }

}
class Smartphone extends Cellphone implements Mycellphone,Mysmartphone{
    public void Ringing(){
        System.out.println("ringing");

    }
    public void Picking(){
        System.out.println("picking");
    }
    public void Gps(){
        System.out.println("geeting the gps");
    }
    public void wifi(){
        System.out.println("wifi speed is slow");
    }
   public String [] name(){
        String []customer={"ram","shyam","gyan"};
        return customer;
    } 
}
public class PolymorphismInterface {
    public static void main(String[] args) {
        Mysmartphone ms=new Smartphone();
        ms.Gps();  // --> this i can access because this is a method Mysmartphone.
        ms.wifi();
     //   ms.name(); -->Mysmartphone is refrence so we can access only the 
     // method Mysmartphone interface and Smartphone is a object.
     Mycellphone mc=new Smartphone();
     mc.Picking();
     mc.Rambharoshe();
     // mc.Gps(); polymorphism one object many form so we can ony acces the method 
     // Mycellphone interface
     Cellphone cp=new Smartphone();
     cp.phoneNumber=678;
     cp.videocall();
     Smartphone sp=new Smartphone();
     sp.calling(775);
     
        
    }
    
}
