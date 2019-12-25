import java.io.IOException;
//import java.io.PrintWriter;

//import org.json.simple.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormAction
 */
@WebServlet("/FormAction")
public class FormAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormAction() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
//		response.sendRedirect("http://localhost:8080/Forest/home.html");
		String uname = request.getParameter("uname");
		String uemail = request.getParameter("uemail");
		String upass = request.getParameter("upass");

		User usr = new User(uname, uemail, upass);
		usr.register();
//		response.setContentType("application/json");
//		response.setStatus(200);

//		Map<String, String> obj = new HashMap<String, String>();
//		obj.put("name", uname);
//		String jsonText = JSONValue.toJSONString(obj);

//		JSONObject obj = new JSONObject();
//		obj.toString("uname", uname);
//
//		PrintWriter output = response.getWriter();
//		output.println(obj);
	}

}
