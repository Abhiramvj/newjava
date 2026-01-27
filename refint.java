interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, compile, run: Faster");
    }
}

public class refint {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        desk.code();
    }
}
