class Base{
    Base(){
        System.out.println("This is base constructor");
    }
    Base(int x){
        System.out.println("This is overloaded constructor with argument class: "+x);
    }
}
 class Derived extends Base{
    Derived(){
         super(9);
         System.out.println("This is derived constructor");
     }
     Derived(int x,int y){
         super(x);
         System.out.println("This is derived contructor with argument x and y: "+y);
     }

}
class ChildDerived extends Derived{
    ChildDerived(int x,int y,int z){
        super(x,y);
        System.out.println("this is childerived class with argument x,y and z: "+z);
    }

}

public class ConstructorInheritance {
    public static void main(String[] args) {
     //   Derived Bc=new Derived();
     //     Derived Bc=new Derived(6,7);
          ChildDerived Ad=new ChildDerived(1,2,3);
        
    }
    
}
