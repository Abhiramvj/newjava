class Mobile {
    static String name;
    String brand;
    int price;

    public void show() {
        System.out.println(name + " " + brand + " " + price);
    }

    public static void show1(Mobile obj1) {
        System.out.println(name + " " + obj1.brand + " " + obj1.price);
    }

}

public class Static {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile.name = "Phone";
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        Mobile.name = "SmartPhone";
        obj2.brand = "Samsung";
        obj2.price = 1300;

        Mobile.name = "Shit";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        
    }
}