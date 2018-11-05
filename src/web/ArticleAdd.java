package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArticleDao;
import model.Article;

/**
 * Servlet implementation class ArticleAdd
 */
@WebServlet("/ArticleAdd")
public class ArticleAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleAdd() {
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
		
		int id;
		List<Article> arList=ArticleDao.getAll();
		id=arList.size()+1;
		System.out.println(id);
		String name=request.getParameter("articleName");
		String content=request.getParameter("articleContent");
		ArticleDao artAdd=new ArticleDao();
		artAdd.addArticle(id, name, content);
		System.out.println("And Succeed");
		request.getRequestDispatcher("ShowArticleServlet").forward(request, response);
	}

}
