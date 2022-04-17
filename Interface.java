interface bicycle{
    int a=8;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Horn{
    void horn();
}
class Avonbicycle implements bicycle,Horn{
    public void applyBrake(int decrement){
        int speed=90;
        speed=speed-decrement;
        System.out.println("speed after applying brake: "+speed);
    }
    public void speedUp(int increment){
        int speed=90;
        speed=speed+increment;
        System.out.println("speedup: "+speed);
    }
    public void horn(){
        System.out.println("Blow horn when it necessary");
    }
} 
public class Interface {
    public static void main(String[] args) {
        Avonbicycle av=new Avonbicycle();
        av.applyBrake(10);
        av.speedUp(10);
        av.horn();
      //  System.out.println(av.a);
       System.out.println(bicycle.a);
     //   bicycle.a=9;
   //  bicycle.a=34; or av.a cannot change the attribute that are final
        
    }
    
}
