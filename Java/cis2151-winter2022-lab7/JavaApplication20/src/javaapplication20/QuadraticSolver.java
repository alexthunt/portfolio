package javaapplication20;

public class QuadraticSolver {

    private double a;
    private double b;
    private double c;
    private double firstInterceptAttribute;
    private double secondInterceptAttribute;

    public QuadraticSolver(double a, double b, double c) throws IllegalArgumentException {
        if ((b * b - 4 * a * c) < 0) {
            throw new IllegalArgumentException("Determinate cannot be negative, there are no X intercepts");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
            firstInterceptAttribute = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            secondInterceptAttribute = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getFirstIntercept() {
        return firstInterceptAttribute;
    }

    public double getSecondIntercept() {
        return secondInterceptAttribute;
    }

    @Override
    public String toString() {

        return (a + "x^2+" + b + "x" + c + "x intercepts are " + firstInterceptAttribute + " and " + secondInterceptAttribute + ".");
    }

}
