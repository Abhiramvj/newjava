class A {
    public A() {
        System.out.println("in a");
    }
    public A(int n) {
        System.out.println("in int A");
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("IN B");
    }

    public B(int n) {
        this();
        System.out.println("in int B");
    }

}

public class Super {
    public static void main(String args[]) {

        B obj = new B(5); 
    }
}
