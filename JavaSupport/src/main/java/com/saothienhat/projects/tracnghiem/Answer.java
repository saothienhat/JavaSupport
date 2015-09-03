package com.saothienhat.projects.tracnghiem;

public class Answer {
	private int id;
	private int questionId;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private String answerE;
	private CorrectAnswerType correctAnswerType;
	
	
	
	/**
	 */
	public Answer() {
	}

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
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}
	
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	/**
	 * @return the answerA
	 */
	public String getAnswerA() {
		return answerA;
	}
	
	/**
	 * @param answerA the answerA to set
	 */
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	
	/**
	 * @return the answerB
	 */
	public String getAnswerB() {
		return answerB;
	}
	
	/**
	 * @param answerB the answerB to set
	 */
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	
	/**
	 * @return the answerC
	 */
	public String getAnswerC() {
		return answerC;
	}
	
	/**
	 * @param answerC the answerC to set
	 */
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	
	/**
	 * @return the answerD
	 */
	public String getAnswerD() {
		return answerD;
	}
	
	/**
	 * @param answerD the answerD to set
	 */
	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}
	
	/**
	 * @return the answerE
	 */
	public String getAnswerE() {
		return answerE;
	}
	
	/**
	 * @param answerE the answerE to set
	 */
	public void setAnswerE(String answerE) {
		this.answerE = answerE;
	}
	
	/**
	 * @return the correctAnswerType
	 */
	public CorrectAnswerType getCorrectAnswerType() {
		return correctAnswerType;
	}
	
	/**
	 * @param correctAnswerType the correctAnswerType to set
	 */
	public void setCorrectAnswerType(CorrectAnswerType correctAnswerType) {
		this.correctAnswerType = correctAnswerType;
	}
	
	
}

