enum Status {
    Running, Failed, Success, Pending 
}

public class learnEnum {
    public static void main(String[] args) {
        Status s= Status.Success;

        switch (s) {
            case Running:
                System.out.println("Its running");
                break;

            case Failed:
                System.out.println("Please try again");
                break;

            case Success:
                System.out.println("all good");
                break;
        
            default:
                System.out.println("Pending");
                break;
        }
    }
}
