
import java.io.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Hello () {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h3>Hello Servlet</h3>");
		out.println("</html></body>");
	}
}