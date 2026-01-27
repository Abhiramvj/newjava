enum Laptop {
    Macbook(2000),Xps(2399),Surface,Thinkpad(1600);

    private int price;

    private Laptop () {
        price = 500;
    }

    private Laptop (int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class lapEnum {
    public static void main(String[] args) {
        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
