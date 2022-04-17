class Employee{
    int id;
    String name;
    int sallary;
    public int getSalary(){
        return sallary;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        name="shyam";
        return name;
    }
    
}
public class getnameclass{
    public static void main(String[] args) {
        Employee dabu=new Employee();
        dabu.id=1;
        dabu.name="ramu";
        dabu.sallary=34000;
        int sallary=dabu.getSalary();
        System.out.println("Sallar is "+sallary);
        String name=dabu.getName();
        System.out.println("name is "+name);
        String name2=dabu.setName("ramu");
        System.out.println("changed name "+name2);


        
    }
}