package Demo;

import java.util.Scanner;

public
class LargestNumber {

    public static
    void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && b > a) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else if (c > a && c > b) {
            System.out.println("c is greater");
        }

        d=c>(a>b?a:b)? c:((b>a)?a:b);
        System.out.println(d);
    }
}
