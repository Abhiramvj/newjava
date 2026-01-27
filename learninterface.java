// class - class => extends
// class - interface => implements
// interface - interface => extends 


interface A {
    int age = 32;
    String area = "Kerala";
    void show();
    void config();
}

interface X {
    void run();
}


interface Y extends X {

}

class B implements A,Y {

    public void show() {
        System.out.println("IN A show");
    }

    public void config() {
        System.out.println("In config");
    }

    public void run() {
        System.out.println("running");
    }
}
public class learninterface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
        

        X obj1 = new B();
        obj1.run();
    }
}
