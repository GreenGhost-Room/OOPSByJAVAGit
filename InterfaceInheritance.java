interface Interface1{
    public void meth1();
    private void meth2(){
        System.out.println("private method in Interface1");
    }
    default void meth3(){
        meth2();
        System.out.println("default method in Interface1");
    }

}
interface Interface2 extends Interface1{
    public void meth4();
}
class Mysampleclass implements Interface2{
    public void meth1(){
        System.out.println("This is method1 from Interface1");
    }
    public void meth4(){
        System.out.println("This is method4 from Interface2");
    }

}
public class InterfaceInheritance {
    public static void main(String[] args) {
        Mysampleclass My=new Mysampleclass();
        My.meth3();
        My.meth1();
        My.meth4();
        
    }
    
}
