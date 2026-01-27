package other;


class A {
    public void show() {
        System.out.println("IN a show");
    }

}

class C extends A {
    public void show1() {
        System.out.println("In show B");
    }    
}
public class B {
    public static void main(String[] args) {
        A obj = new C();
        
        obj.show();

        C obj1 = (C) obj;
        obj1.show1();
    }
}
