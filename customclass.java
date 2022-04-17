class employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("And my name is "+name);

    }
    public void getSalary(){
        System.out.println("my salaary is "+salary);
       
    }

}
public class customclass {
    public static void main(String[] args) {
        employee dabu=new employee();
        dabu.id=1;
        dabu.name="ramu";
        dabu.salary=12000;
     
        dabu.printDetails();
        dabu.getSalary();
       
    }
    
    
}
