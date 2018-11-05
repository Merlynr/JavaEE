package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminLogin;
import model.Admin;

/**
 * Servlet implementation class CheckAdminLogin
 */
@WebServlet("/CheckAdminLogin")
public class CheckAdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
//		HttpSession session = request.getSession();
//		ServletContext application = session.getServletContext();
		
		Admin admin=new Admin();
		admin.setAdminName(request.getParameter("adminName"));
		admin.setAdminPassword(request.getParameter("adminPassword"));
		System.out.println("zhanghao"+request.getParameter("adminName"));
		if(AdminLogin.adminLogin(admin)) {
			System.out.println("admin Login Succeed");
			response.sendRedirect("/blog2016121049/admin/index.jsp");
		}else {
			System.out.println("admin Login Failed");
			response.sendRedirect("/blog2016121049/admin/login.jsp");
		}
	}

}
