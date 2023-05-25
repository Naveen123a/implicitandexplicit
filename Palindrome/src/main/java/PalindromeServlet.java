import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PalindromeServlet
 */
public class PalindromeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PalindromeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        boolean isPalindrome = checkPalindrome(number);

        // Prepare the response
        String result;
        if (isPalindrome) {
            result = number + " is a palindrome.";
        } else {
            result = number + " is not a palindrome.";
        }

        // Send the response
        response.setContentType("text/html");
        response.getWriter().write(result);
    }

    // Helper method to check if a number is a palindrome
    private boolean checkPalindrome(String number) {
        // Remove any non-digit characters from the number
        String cleanedNumber = number.replaceAll("\\D", "");

        // Reverse the number and compare it with the original
        String reversedNumber = new StringBuilder(cleanedNumber).reverse().toString();
        return cleanedNumber.equals(reversedNumber);

	}

}
