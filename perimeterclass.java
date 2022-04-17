class Square{
    int side;

public int area(int side){
    return side*side;

}
public int perimeter(int side){
    return 4*side;
}
}
public class perimeterclass {
    public static void main(String[] args) {
        Square square=new Square();
        square.side=3;
        System.out.println("area "+square.area(square.side));
        System.out.println("perimeter "+square.perimeter(square.side));
         
    }
    
}
