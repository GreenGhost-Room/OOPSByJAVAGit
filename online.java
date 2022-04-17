import java.util.Scanner;

class Library{
   public String BookName;
  
   
    public void Available(){
        String[] subjects={"physics","math","english","c","c++","java","python","dsa",
        "chemistry","bilogy","Electrical"};
        boolean test=false;
        for(int i=0;i<subjects.length;i++){
            String BookValue=subjects[i];
            if(BookName.equals(BookValue)){
                test=true;
                break;
            }


        }
        if(test){
            System.out.println("book avialble");
            Scanner sp=new Scanner(System.in);
            System.out.print("I am issueing your book on date: ");
            String Issuedate=sp.next();
            System.out.println("Issuedate: "+Issuedate);
            System.out.println("you have to return the book after 21 days of issue");
            sp.close();

        }
        else{
            System.out.println("soory book is not available");
        }
     
      
    } 
   


}
public class online {
    public static void main(String[] args) {
        Scanner Book=new Scanner(System.in);
        System.out.print("please enter the book name which you want: ");
        String bk=Book.nextLine();
        System.out.println("You want Book: "+bk);
        Library lb=new Library();
        lb.BookName=bk;
        lb.Available();
        Book.close();
       
        
    }
    
}
