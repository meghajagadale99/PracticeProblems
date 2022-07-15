package EualsHashcode.Exception;

public
class MultipleTryCatch {
    public static
    void main(String[] args) {
        try {

            try {
                int[] a = new int[5];
                a[5] = 30;

                try {
                    int i = 10 / 0;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("hello");
    }
}
