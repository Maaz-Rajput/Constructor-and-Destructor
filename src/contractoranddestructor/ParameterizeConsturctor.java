package contractoranddestructor;

public class ParameterizeConsturctor {
    int id;
    String name;
    
    //creating a parameterized constructor
    ParameterizeConsturctor(int i , String j){
    id = i;
    name = j;
    }
    
    void display(){
        System.out.println(id +" "+ name );
    }
    
    public static void main (String []abc){
    ParameterizeConsturctor p1 = new ParameterizeConsturctor(1,"aqsa");
    ParameterizeConsturctor p2 = new ParameterizeConsturctor(1,"aqsa");
    p1.display();
    p2.display();
    }
}
