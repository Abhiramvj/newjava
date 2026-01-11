class Mobile {
    int price;
    static String name;
    String brand;
    public Mobile() {
        brand = "";
        price= 200;
        System.out.println("in constructore");
    }

    static {
        name = "phone";
        System.out.println("in statuc");
    }

    public void show() {
    System.out.println(name + " " + brand + " " + price);
}
}



public class Static {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("hii");
        // Mobile obj1 = new Mobile();
        // obj1.price = 1500;
        // Mobile.name = "SmartPhone";
        // obj1.brand = "Apple";


    }
}
