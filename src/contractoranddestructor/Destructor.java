package contractoranddestructor;


public class Destructor {
    public void finalize() throws Throwable{
        System.out.println("Object is destroyed by garbage collector");
    }
    public static void main (String []abc){
    Destructor test = new Destructor();
    test = null;
    System.gc();
    }
}
