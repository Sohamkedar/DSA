 package ArrayList;

class Polynomial {
    private int[] coefficients;

    // Constructor to initialize a polynomial of a certain degree
    public Polynomial(int degree) {
        coefficients = new int[degree + 1];
    }

    // Method to set the coefficient for a particular degree
    public void setCoefficient(int degree, int coefficient) {
        coefficients[degree] = coefficient;
    }

    // Method to get the coefficient of a particular degree
    public int getCoefficient(int degree) {
        return coefficients[degree]; // corrected from 'coefficient[degree]' to 'coefficients[degree]'
    }

    // Method to add two polynomials
    public Polynomial add(Polynomial other) {
        int maxDegree = Math.max(this.coefficients.length, other.coefficients.length); // corrected 'Int' to 'int'
        Polynomial result = new Polynomial(maxDegree - 1);
        
        for (int i = 0; i < maxDegree; i++) {
            int thisCoeff = i < this.coefficients.length ? this.coefficients[i] : 0; // corrected 'this.coefficints' to 'this.coefficients'
            int otherCoeff = i < other.coefficients.length ? other.coefficients[i] : 0; // corrected 'other.coefficient' to 'other.coefficients'
            result.setCoefficient(i, thisCoeff + otherCoeff);
        }
        return result;
    }

    // Method to evaluate the polynomial at a certain value of x
    public int evaluate(int x) {
        int result = 0;
        for (int i = coefficients.length - 1; i >= 0; i--) { // corrected 'coefficient.length' to 'coefficients.length'
            result = result * x + coefficients[i];
        }
        return result;
    }

    // Method to print the polynomial
    public void print() {
        for (int i = coefficients.length - 1; i >= 0; i--) { // corrected 'coefficient.length' to 'coefficients.length'
            if (coefficients[i] != 0) {
                System.out.print(coefficients[i] + "x^" + i + " ");
                if (i > 0) {
                    System.out.print("+ ");
                }
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(2);
        p1.setCoefficient(0, 2);
        p1.setCoefficient(1, 3);
        p1.setCoefficient(2, 4);
        
        Polynomial p2 = new Polynomial(2);
        p2.setCoefficient(0, 1);
        p2.setCoefficient(1, 2);
        p2.setCoefficient(2, 3);
        
        System.out.println("Polynomial 1:");
        p1.print();
        
        System.out.println("Polynomial 2:");
        p2.print();
        
        Polynomial sum = p1.add(p2);
        System.out.println("Sum of Polynomials:");
        sum.print();
        
        int x = 2;
        System.out.println("Evaluation of Polynomial 1 at x = " + x + ": " + p1.evaluate(x));
    }
}
