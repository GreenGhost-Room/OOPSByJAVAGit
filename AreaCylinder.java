class Cylinder{
   private float radius;
   private float height;
    public void setRadius(float R){    //setters 
        radius=R;
    }
    public float getRadius(){    //getters
        return radius;
    }
    public void setHeight(float H){    //setters
        height=H;
    }
    public float getHeight(){
        return height;
    }
    public void getSurfaceArea(){
        float area;
        area=(float)((2*3.14*radius*height)+(2*3.14*radius*radius));
        System.out.println("Surface area: "+area);
    }
    public void getVolume(){
        float volume;
        volume=(float)(3.14*radius*radius*height);
        System.out.println("Volume: "+volume);
    }
    public Cylinder(){
        radius=4.5f;
        height=2.4f;
    }
    public Cylinder(float R,float H){    //method overloading
        radius=R;
        height=H;
    }

}
public class AreaCylinder {
    public static void main(String[] args) {
       // Cylinder dabu=new Cylinder();
        Cylinder dabu=new Cylinder(4.5f,9.7f);
     //   dabu.setRadius(2.3f);
     //   dabu.setHeight(3.4f);
        System.out.println(dabu.getRadius());
        System.out.println(dabu.getHeight());
        dabu.getSurfaceArea();
        dabu.getVolume();
        
    }
    
}
