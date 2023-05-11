package expcn;

	class CustomException extends Exception {
	    public CustomException(String message) {
	        super(message);
	    }
	}

	class exceptionth {
	    public static void main(String[] args) {
	        try {
	            divideNumbers(10, 0);
	        } catch (CustomException e) {
	            System.out.println("CustomException caught: " + e.getMessage());
	        } finally {
	            System.out.println("Cleanup operations in the finally block.");
	        }
	    }

	    public static void divideNumbers(int dividend, int divisor) throws CustomException {
	        if (divisor == 0) {
	            throw new CustomException("Cannot divide by zero!");
	        }
	        int quotient = dividend / divisor;
	        System.out.println("Quotient: " + quotient);
	    }
	}


