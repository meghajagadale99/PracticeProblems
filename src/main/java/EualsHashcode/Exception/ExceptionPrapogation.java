package EualsHashcode.Exception;

public
class ExceptionPrapogation {
    void m1(){
       // int i = 30 / 0; throw new ThrowKeyword("not run");
    }

    void p1(){
        m1();
    }

    void megha(){
        try{
            m1();
        }catch (Exception e){
            System.out.println("handled");
        }
    }

    public static
    void main(String[] args) {
        ExceptionPrapogation exceptionPrapogation = new ExceptionPrapogation();
        exceptionPrapogation.megha();
        System.out.println("hello");
    }
}
