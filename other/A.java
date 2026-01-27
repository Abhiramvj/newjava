package other;

class Laptop {
    String model;
    int price;

    public String toString() {
        return "Hey";
    }

    public boolean equals(Laptop that) {
        if((this.model.equals(that.model)) && this.price== that.price) {
            return true;
        }
        else {
            return false;
        }
    }
}
public class A {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "MacBook";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "MacBook";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
    }
}
