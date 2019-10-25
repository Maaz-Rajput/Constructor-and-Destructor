
package contractoranddestructor;


public class DefaultValue {
    int id = 1234;
    String name = "Maaz";
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String []abc){
    
        DefaultValue p1 = new DefaultValue();
        DefaultValue p2 = new DefaultValue();
        
        p1.display();
        p2.display();
    }
}
