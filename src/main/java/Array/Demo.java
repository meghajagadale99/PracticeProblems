package Array;

public
class Demo {
    public static
    void main(String[] args) {
//        int[] a= new int[5];
//
//        a[0]=1;
//        a[1] = new Integer(10);
//        a[2]=3;
//
//        for(int i = 0 ;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//
//        for (int element:a
//        ) {
//            System.out.println(element);
//        }
//        int[][] a= new int[3][3];
        // int[][][] a = {{{1, 2, 3}, {4, 5, 6}, {2, 4}}};
        int[] a = {1, 2, 3};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                for (int k = 0; k < a[i][j].length; k++) {
//                    System.out.print(a[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//
//        }

        //using while loop

//        int i =0;
//        while(i<a.length){
//            System.out.println(a[i]);
//            i++;
//        }

        //do while loop
//        int i=0;
//        do{
//            System.out.println(a[i]);
//            i++;
//        }while(i<a.length);

        //clone array
        int[] megha = a.clone();
        for (int i : megha
        ) {
            System.out.println(i);
        }
    }
}


