public class exceptionHandling {
    public static void main(String[] args) {
        int a=10, b=0,c;//b=2 or 0

        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0, try again ");
        }
    }
}
