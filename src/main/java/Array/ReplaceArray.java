package Array;

public
class ReplaceArray {
    public static
    void main(String[] args) {
        int[] a = {1, 5, 3, 8, 5, 4};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 5) {
                a[i] = 0;
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
