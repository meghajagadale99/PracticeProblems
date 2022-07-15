package Array;

public
class MaxAndMinArray {
    public static
    void main(String[] args) {
        int[] a = {1, 2, 30, 4, 6};
//        int max = 0;
//
//        for(int i=0;i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println(max);
//    }
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }

}
