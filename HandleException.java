class AbhiramException extends Exception {
    public AbhiramException(String str) {
        super(str);
    }
}

public class HandleException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j= 18/i;
            if(j==0) {
                throw new AbhiramException("Code is wrong");
            }
        }catch(AbhiramException e)  {
            System.out.println("Default excepition abhierma " + e);
        }
         catch(Exception e) {
            System.out.println("default");
        }
    }
}
