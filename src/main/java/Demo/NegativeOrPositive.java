package Demo;

import java.util.Scanner;

public
class NegativeOrPositive {
    public static
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int input = sc.nextInt();

        if (input > 0) {
            System.out.println("positive number");
        } else if (input < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("nothing");
        }
    }
}
