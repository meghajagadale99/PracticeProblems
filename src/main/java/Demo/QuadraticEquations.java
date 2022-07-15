package Demo;

import java.util.Scanner;

public
class QuadraticEquations {
    public static
    void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double result = b * b - 4 * a * c;

        if (result > 0) {
            double r1 = -b + Math.sqrt(result) / 2 * a;
            double r2 = -b - Math.sqrt(result) / 2 * a;
            System.out.println("The Roots Are" + r1 + " " + r2);
        } else if (result == 0) {
            double r1 = -b / 2 * a;
            System.out.println("Root are" + r1);
        }
        System.out.println("The Equation has no Real roots");
    }
}
