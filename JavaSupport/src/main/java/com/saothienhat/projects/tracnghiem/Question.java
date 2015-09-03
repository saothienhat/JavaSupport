package com.saothienhat.projects.tracnghiem;

public class Question {
	private int id;
	private String content;
	/**
	 * Field of type QuestionContentType to store questionContentType  
	 */
	private QuestionContentType questionContentType;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	
	/**
	 */
	public Question() {
	}

	/**
	 * @return the questionContentType
	 */
	public QuestionContentType getQuestionContentType() {
		return questionContentType;
	}
	
	/**
	 * @param questionContentType the questionContentType to set
	 */
	public void setQuestionContentType(QuestionContentType questionContentType) {
		this.questionContentType = questionContentType;
	}

}
