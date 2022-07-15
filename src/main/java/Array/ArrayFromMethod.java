package Array;

public
class ArrayFromMethod {

    public  int[] get(){
        return new int[]{1,2,3,4,5};
    }

    public  static int[] getArray(){
        return new int[]{1,2,3,4,5};
    }
    public static
    void main(String[] args) {
        ArrayFromMethod arrayFromMethod = new ArrayFromMethod();
        int[] a = arrayFromMethod.get();
       // int[] a=getArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
