class A {
    int age ;

    public void show() {
        System.out.println("In show");
    } 

    class B {
       public void config() {
         System.out.println("IN config");
       }
    }
}

public class subclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); 
        obj1.config();
    }
    
}
