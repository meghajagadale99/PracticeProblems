package statickeyword;

public
class Counter {
    private static int counter;

    public
    Counter() {
        counter = 0;
//        counter++;
//        System.out.println(counter);
    }

    public static
    void counter() {
        counter++;
        System.out.println(counter);
    }

    public static
    void main(String[] args) {
        Counter sc = new Counter();
        counter();
    }
}
