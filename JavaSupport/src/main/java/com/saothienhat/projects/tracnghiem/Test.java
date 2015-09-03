package com.saothienhat.projects.tracnghiem;

public class Test {
	private Question question;
	private Answer answer;
	// Explain for Answer
	private String explaination;
	
	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}
	
	
	/**
	 * Method to setQuestion
	 *
	 * @param question
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	/**
	 * Construct new instance of Test
	 */
	public Test() {
	}

	/**
	 * @return the answer
	 */
	public Answer getAnswer() {
		return answer;
	}
	
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	
	/**
	 * @return the explaination
	 */
	public String getExplaination() {
		return explaination;
	}

	
	/**
	 * @param explaination the explaination to set
	 */
	public void setExplaination(String explaination) {
		this.explaination = explaination;
	}

}
