// Getters and Setters
class MyEmployee{
  private int id;
   private String name;
   public int getId(){ //Getters 
       return id;

   }
   public void setId(int n){  //Setters
       id=n;
   }
   public String getName(){
       return name;

   }
   public void setName(String naam){
       name=naam;
   }
    
}
public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee dabu=new MyEmployee();
      //  dabu.id=12; Through an error due to private access modifier
      //   dabu.name="frog";
      dabu.setName("raju");
      System.out.println(dabu.getName());
      dabu.setId(3);
      System.out.println(dabu.getId());

        
    }
    
}
