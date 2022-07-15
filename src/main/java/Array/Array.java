package Array;

public
class Array {
    public static
    void main(String[] args) {
        //  ************ 1-D Array *************//

        // retrieve or traverse
        //  int [] a={10,20,30};

//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//        for (int number: a
//             ) {
//            System.out.println(number);
//
//        }
        //declaration
//        int[] a; a is one dimensional int array
//        int c[];
        //creation or instantiation
//        a = new int[5];
//        int[] e = new int[5];
//        int[] f = new int[0];
        //initialization
//        a[3] = 5;
//        int[] a = {1, 2, 3, 4};
//        int[] a = new int[]{1, 3, 4, 5};

        //  ************ 2-D Array *************//

        //declaration
        //int[][][] a;
//        int[] a[];
//        int a[][];
//        int[][] a;
//        int[][] a;
        //creation
//        a = new int[][][]{{{1, 2, 3}, {3, 4, 5}, {4,8, 5}}};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                for (int k = 0; k < a[i][j].length;k++){
//                    System.out.print(a[i][j][k] + " ");
//                }
//                System.out.println();
//            }

  //      }
        Array.sum(new int[]{1,2,3});
    }
    static void sum(int[] number){ //anonymous array
        int totalNumber=0;
        for (int i:number
             ) {
            totalNumber=totalNumber+i;
        }
        System.out.println(totalNumber);
    }

}
