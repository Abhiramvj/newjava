abstract class  Car {
    public abstract void drive();

    public abstract void fly();

    public void playmusic() {
        System.out.println("playing music");
    }
    
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("drinving...");
    }
}

class UpdatedWagonR extends WagonR {
    public void fly() {
        System.out.println("flying");
    }
}

public class learnabstract {
    public static void main(String[] args) {
        WagonR obj = new UpdatedWagonR();
         obj.drive();
         obj.playmusic();
         obj.fly();

    }
}
