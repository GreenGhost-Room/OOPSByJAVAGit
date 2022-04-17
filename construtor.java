class MyEmployee{
    private int id;
     private String name;
     public MyEmployee(){    //Constructor
        id=14;
        name="dabu";
     }
     public MyEmployee(String n1,int n2){    //constructor overloading
         id=n2;
         name=n1;
     }
     public MyEmployee(String n1){            //constructor overloading
         id=3;
         name=n1;
     }
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
public class construtor {
    public static void main(String[] args) {
        MyEmployee dabu=new MyEmployee();
        MyEmployee saw=new MyEmployee("ramu",23);
        MyEmployee tinu=new MyEmployee("jatayu");
        System.out.println(dabu.getId());
        System.err.println(dabu.getName());
        System.out.println(saw.getId());
        System.out.println(saw.getName());
        System.out.println(tinu.getId());
        System.out.println(tinu.getName());
        
    }

    
}
