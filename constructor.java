class Human {
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "John";
    }

    public Human(int a, String n) {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(12,"Holly");
        // obj.setAge(13);
        // obj.setName("shelby");

        System.out.println(obj.getName() + " " + obj.getAge());
        System.out.println(obj1.getName() + " " + obj1.getAge());

    }
}
