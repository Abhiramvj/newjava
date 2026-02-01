interface A {
    int add(int i,int j);
}



public class lambdaexp {
    public static void main(String[] args) {
        A obj = (i,j) -> i + j;
        int result = obj.add(5,5);
        System.out.println(result);
    }
}
