package EualsHashcode;

class Parent {

}

class Child extends Parent{

}
public
class InstanceOf {
    public static
    void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        if(child instanceof Parent){
            System.out.println("Child is a instance of parent");
        }else{
            System.out.println("Child is a not  instance of parent");
        }
        if (parent instanceof Child){
            System.out.println("Parent is a instance of child");
        }else{
            System.out.println("parent is a not instance of child");
        }
    }
}
