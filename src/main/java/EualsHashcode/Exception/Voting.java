package EualsHashcode.Exception;

public
class Voting {
//    public static
//    void ageVoting() {
//        int age = 16;
//        try{
//            if (age <= 18);
//            System.out.println("not eligible");
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
//
//    public static
//    void main(String[] args) {
//        ageVoting();
//        System.out.println("hello");
//    }

    public void ageVoting(){
        int age =16;
        try {
        if(age <18)  {
            throw new ThrowKeyword("not eligible");
        }else System.out.println("eligible");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static
    void main(String[] args) {
        Voting voting = new Voting();
        voting.ageVoting();
        System.out.println("hello");
    }
}

