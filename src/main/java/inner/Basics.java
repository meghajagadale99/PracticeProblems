package inner;

public
class Basics {
    private static  int number =10;
    private int megha;

    public
    Basics(int megha) {
        this.megha = megha;
    }

    IMegha imegha =new IMegha(){
    }; //anonymous class
    public void m1(){
        System.out.println(Basics.number);
        System.out.println(this.megha);
        class Inner{//local inner class
            public void m1(){
                System.out.println("alka");
            }
        }
        Inner inner = new Inner();
        inner.m1();
    }
     class Megha{
        private int megha;

         Megha(int megha) {
             this.megha = megha;
         }

         public void m2(){
            System.out.println(Basics.number);
             System.out.println(Basics.this.megha);
             System.out.println(this.megha);
        }
        public  void m3(){
            System.out.println("Hello");
        }
    }
    public static
    void main(String[] args) {
        Basics basics = new Basics(20);
        basics.m1();
        Basics.Megha megha = basics.new Megha(30);
        megha.m2();
        megha.m3();
    }

}