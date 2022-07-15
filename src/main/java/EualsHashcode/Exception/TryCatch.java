package EualsHashcode.Exception;

public
class TryCatch {
    public static
    void main(String[] args) {
        int i=10,j=0,result;
        try{
            result=i/j;
        } catch (ArithmeticException e) {
           // System.out.println(e);
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }finally {
            System.out.println("finally block is always executed");
        }
    }
}
