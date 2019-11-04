

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.User;
import com.lti.UserDAO;

/**
 * Servlet implementation class FetchController
 */
@WebServlet("/FetchController")
public class FetchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		
		//System.out.println(request.getParameter("id"));
		int id=Integer.parseInt(request.getParameter("id"));
		//System.out.println(request.getParameter("id"));
		
		
		
		
		User u=new User();
		u.setId(id);
		
		
		UserDAO userDao = new UserDAO();
		User user = userDao.getUserById(id);
		
		if(user!=null)
		{
			session.setAttribute("userById",user);
			RequestDispatcher rd = request.getRequestDispatcher("/fetchUser.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/fetchUser.jsp?message=Failed");
			rd.forward(request, response);
		}
		
	}
}
