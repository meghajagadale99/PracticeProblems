package EualsHashcode;


class WhatsApp {
    public int id;
    public String name;

    public
    void chat() {
        System.out.println(name + " Chatting Feature");
    }
}

class FaceBook extends WhatsApp {
    public
    void addUser() {
        System.out.println(name + " Add user");
    }
}

public
class TypeCasting {
    public static
    void main(String[] args) {
        WhatsApp whatsApp = new FaceBook();
        whatsApp.id = 1;
        whatsApp.name = "megha";
        whatsApp.chat();

        FaceBook faceBook =(FaceBook) whatsApp;
        faceBook.addUser();

//        Integer x=10, y=10;
//        if(x==y){
//            System.out.println("same");
//        }else{
//            System.out.println("not same");
//        }

        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
        Integer x = new Integer(10);
        Integer y = 10;
       // y= new Integer(10);
        System.out.println(x==y);
    }

}
