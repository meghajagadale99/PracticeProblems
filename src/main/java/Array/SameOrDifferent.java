package Array;

public
class SameOrDifferent {

    public static
    void main(String[] args) {
        int[] c = {'a', 'b', 'c', 'd'};
        if(c[0]==c[c.length-1]){
            System.out.println(" same");
        }else{
            System.out.println(" not same");
        }
    }
}
