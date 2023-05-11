package expnal;

public class Exhand {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Cleanup operations in the finally block.");
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        int result;
        try {
            result = dividend / divisor;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return result;
    }
}
