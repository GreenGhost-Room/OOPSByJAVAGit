class A{
    int a;
    public int meth1(){
        return a;
    }
    public void meth2(){
        System.out.println("it is method 2 of A");
    }
    public void meth3(){
        int a=2,b=3;
        int sum=a+b;
        System.out.println("sum; "+sum);
    }

}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("it is method 2 of B");
    }
    
}
 public class MethodOverriding {
    public static void main(String[] args) {
        B b=new B();
        A a=new A();
        b.a=2;
        System.out.println(b.a);
        b.meth2();
        a.meth2();
        b.meth3();
        
    }
    
}
