package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Article;
import util.DBUtil;

public class ArticleDao {
	public static List<Article> getAll(){
		DBUtil db=new DBUtil();
		Connection  connection  = null;
		PreparedStatement statement = null;
		ResultSet  resultSet = null;
		try {
			List<Article> list = new ArrayList<>();
			String sql="select * from article";
			connection=db.getConnection();
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			if(resultSet!=null){
				while(resultSet.next()){
					Article ar = new Article();
					ar.setArticleId(resultSet.getInt("article_id"));
					ar.setArticleTitlt(resultSet.getString("article_title"));
					ar.setArticleContent(resultSet.getString("article_content"));
					ar.setArticleComment(resultSet.getString("article_comment"));
					list.add(ar);
				}
				return list;
			}else {
				System.out.println("ÎÞÊý¾Ý");
			}
		}catch(Exception err) {
			err.printStackTrace();
		}finally {
			db.close(connection, statement, resultSet);
		}
		return null;
	}
	
	public static boolean addArticle(int id,String title,String content) {
		DBUtil db1=new DBUtil();
		Connection  connection  = null;
		PreparedStatement statement = null;
		ResultSet  resultSet = null;
		System.out.println("test");
		try {
			connection=db1.getConnection();
			String sql="insert into article(article_id,article_title,article_content) value(?,?,?)";
			statement=connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setString(2, title);
			statement.setString(3, content);
			statement.executeUpdate();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db1.close(connection, statement, resultSet);  
		}
		return false;
	}
	
	public static boolean deArticle(int id) {
		DBUtil db2=new DBUtil();
		Connection  connection  = null;
		PreparedStatement statement = null;
		ResultSet  resultSet = null;
		try {
			String sql="delete from article where arricle_id='?'";
			connection = db2.getConnection();
			statement=connection.prepareStatement(sql);
			statement.setInt(1,id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db2.close(connection, statement, resultSet);
		}
		return false;
	}
	
	public static boolean findArticle(String articleName) {
		DBUtil db2=new DBUtil();
		Connection  connection  = null;
		PreparedStatement statement = null;
		ResultSet  resultSet = null;
		try {
			String sql="select * from article where arricle_name='?'";
			connection = db2.getConnection();
			statement=connection.prepareStatement(sql);
			statement.setString(1,articleName);
			statement.executeUpdate();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db2.close(connection, statement, resultSet);
		}
		return false;
	}
	
	public static boolean updateArticle(String articleName,String comment) {
		DBUtil db4=new DBUtil();
		Connection  connection  = null;
		PreparedStatement statement = null;
		ResultSet  resultSet = null;
		try {
			String sql="UPDATE article SET article_comment=? WHERE article_title=?";
			connection = db4.getConnection();
			statement=connection.prepareStatement(sql);
			statement.setString(1,comment);
			statement.setString(2,articleName);
			statement.executeUpdate();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db4.close(connection, statement, resultSet);
		}
		return false;
	}
}

