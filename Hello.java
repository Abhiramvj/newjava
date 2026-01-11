class Calculator {
    public void getMeMusic(){
        System.out.println("Music Playing");
    }
    public String getMeAPen(int cost) {
        if(cost>=10) {
            return "Pen";
        }
        return "No pen";
    }
}


public class Hello {
    public static void main(String[] args) {
       Calculator obj = new Calculator();
       obj.getMeMusic();
       String str = obj.getMeAPen(8);
       System.out.println(str);
    }
}