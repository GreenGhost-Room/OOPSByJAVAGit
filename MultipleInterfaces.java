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
public class MultipleInterfaces {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
       String[] gh=sp.name();
        for(String kg: gh){
            System.out.println(kg);
        } 
        sp.wifi();
        sp.videocall();
        sp.Ringing();
        sp.Picking();
        sp.Gps();
        sp.calling(574);
        sp.phoneNumber=5545;
        sp.videocall();
        System.out.println(Mycellphone.x);
        sp.Rambharoshe();
    }
    
}
