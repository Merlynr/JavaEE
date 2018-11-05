package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ArticleDao;
import model.Article;

/** 
 * Servlet implementation class ShowArticleServlet
 */
@WebServlet("/ShowArticleServlet")
public class ShowArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /** 
     * @see HttpServlet#HttpServlet()
     */
    public ShowArticleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession se = request.getSession();
//		‘O÷√æé¥a∏Ò Ω
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		List<Article> arList=ArticleDao.getAll();	
		se.setAttribute("articlelist", arList);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
