public
class Exceptions {
    public static
    void main(String[] args) throws InterruptedException {
        try {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new InterruptedException("Illegal Argument");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("exit");
    }
}

