

// inheritance 
class Sphere{
  private  float radius;
    public void setRadius(float R){
        radius=R;
    }
    public float getRadius(){
        return radius;
    }
    public void printArea(){
        float area;
        area=(float)(4*3.14*radius*radius);
        System.out.println("Area of sphere: "+area);
    }
    public void printVolume(){
        float volume;
        volume=(float)((4/3)*(3.14*radius*radius*radius));
        System.out.println("volume of sphere: "+volume);
    }
}
class Rectangle extends Sphere{
    int length;
    int breath;
    public void areaRectangle(){
        int area;
        area=length*breath;
        System.out.println("area of rectangle: "+area);
    }
}
public class SphereArea {
    public static void main(String[] args) {
     //   Sphere dabu=new Sphere();
          Rectangle dabu=new Rectangle();

        dabu.setRadius(3.4f);
        System.out.println(dabu.getRadius());
        dabu.printArea();
        dabu.printVolume();
        dabu.length=3;
        dabu.breath=2;
        dabu.areaRectangle();


        
    }
    
}
