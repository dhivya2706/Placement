import java.util.Scanner;

class Polynomial {
    private int degree;
    private int[] coeff;
    Polynomial(int degree) {
        this.degree = degree;
        coeff = new int[degree + 1];
    }
    public void setPolynomial(Scanner sc) {
        System.out.println("Enter coefficients from x^0 to x^" + degree);
        for (int i = 0; i <= degree; i++) {
            coeff[i] = sc.nextInt();
        }
    }
    public void display() {
        boolean first = true;
        for (int i = degree; i >= 0; i--) {
            if (coeff[i] != 0) {
                if (!first)
                    System.out.print(" + ");
                System.out.print(coeff[i]);
                if (i > 0)
                    System.out.print("x^" + i);
                first = false;
            }
        }
        System.out.println();
    }
    public Polynomial multiply(Polynomial p) {
        Polynomial result = new Polynomial(this.degree + p.degree);

        for (int i = 0; i <= this.degree; i++) {
            for (int j = 0; j <= p.degree; j++) {
                result.coeff[i + j] += this.coeff[i] * p.coeff[j];
            }
        }

        return result;
    }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter degree of first polynomial: ");
        int d1 = sc.nextInt();

        Polynomial p1 = new Polynomial(d1);
        p1.setPolynomial(sc);

        System.out.print("Enter degree of second polynomial: ");
        int d2 = sc.nextInt();

        Polynomial p2 = new Polynomial(d2);
        p2.setPolynomial(sc);

        System.out.println("\nFirst Polynomial:");
        p1.display();

        System.out.println("Second Polynomial:");
        p2.display();

        Polynomial result = p1.multiply(p2);

        System.out.println("Result of Multiplication:");
        result.display();
    }
}
}