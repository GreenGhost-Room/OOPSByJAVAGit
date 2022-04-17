class Radius{
   public int r;
   //private int r; for getter and setters
   public void setRadius(int R){
       this.r=R;
   }
   public int getRadius(){
       return r;
   }
   public void area(){
       float area;
       area=(float) (3.14*r*r);
       System.out.println("area: "+area);
   }
   public void perimeter(){
       float perimeter;
       perimeter=(float)(2*3.14*r);
       System.out.println("Perimeter: "+perimeter);
   }
}
class height extends Radius{
    int height;
    public void areaCylinder(){
        float area;
        area=(float)((2*3.14*height*r)+(2*3.14*r*r));
        System.out.println("area of cylinder: "+area);
    }
}
public class Circle {
    public static void main(String[] args) {
    //    Radius rd=new Radius();
    //    rd.setRadius(3);
    //    System.out.println(rd.getRadius());
    //    rd.area();
    //    rd.perimeter();
        height hg=new height();
        hg.height=3;
      //  hg.area();
       // hg.perimeter();
        hg.setRadius(4);
        System.out.println(hg.getRadius());
        hg.area();
        hg.perimeter();
        hg.areaCylinder();
        
        
    }
    
}
