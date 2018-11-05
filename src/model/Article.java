package model;

import java.io.Serializable;

public class Article implements Serializable{
	private int articleId;
//	private int user_id;
	private String articleTitle;
	private String articleContent;
	private String articleComment;
	
	public void setArticleId(int article_id) {
		this.articleId=article_id;
	}
	public int getArticleId() {
		return articleId;
	}
	
	public void setArticleTitlt(String article_title) {
		this.articleTitle=article_title;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	
	public void setArticleContent(String article_content) {
		this.articleContent=article_content;
	}
	public String getArticleContent() {
		return articleContent;
	}
	
	public void setArticleComment(String article_content) {
		this.articleComment=article_content;
	}
	public String getArticleComment() {
		return articleComment;
	}
}
