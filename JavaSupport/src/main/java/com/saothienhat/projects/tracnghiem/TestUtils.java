/*
 * Copyright (c) 2015 Trinh Thanh Binh. All rights reserved.
 */
package com.saothienhat.projects.tracnghiem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author binhtt
 *
 */
public final class TestUtils
{

	public static void readFile( String filePath )
	{
		File file = new File(filePath);
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			int count = 0;
			List<Test> tests = new ArrayList<Test>();
			Question question = new Question();
			Answer answer = new Answer();
			Test test = new Test();

			while ((line = br.readLine()) != null)
			{
				if (line != null && !line.isEmpty())
				{
					// Question
					if (Character.isDigit(line.charAt(0)))
					{
						// String questionContent = "Question " + line;
						String questionContent = line;
						question.setContent(questionContent);
						question.setQuestionContentType(QuestionContentType.TEXT);
						test.setQuestion(question);
					}

					// Answer content
					String answerContent = "";
					if (line.contains("a."))
					{
						answerContent = line.replace("a.", "").trim();
						answer.setAnswerA(answerContent);
					}
					else if (line.contains("b."))
					{
						answerContent = line.replace("b.", "").trim();
						answer.setAnswerB(answerContent);
					}
					else if (line.contains("c."))
					{
						answerContent = line.replace("c.", "").trim();
						answer.setAnswerC(answerContent);
					}
					else if (line.contains("d."))
					{
						answerContent = line.replace("d.", "").trim();
						answer.setAnswerD(answerContent);
					}
					else if (line.contains("e."))
					{
						answerContent = line.replace("e.", "").trim();
						answer.setAnswerE(answerContent);
					}

					// Correct Answer
					if (line.contains("-->"))
					{
						String correctAnswer = line.replace("-->", "").trim();

						if (correctAnswer.equalsIgnoreCase("a"))
						{
							answer.setCorrectAnswerType(CorrectAnswerType.A);
						}
						else if (correctAnswer.equalsIgnoreCase("b"))
						{
							answer.setCorrectAnswerType(CorrectAnswerType.B);
						}
						else if (correctAnswer.equalsIgnoreCase("c"))
						{
							answer.setCorrectAnswerType(CorrectAnswerType.C);
						}
						else if (correctAnswer.equalsIgnoreCase("d"))
						{
							answer.setCorrectAnswerType(CorrectAnswerType.D);
						}
						else if (correctAnswer.equalsIgnoreCase("e"))
						{
							answer.setCorrectAnswerType(CorrectAnswerType.E);
						}

						// Reset a Question with Answers

						test.setAnswer(answer);
						tests.add(test);

						test = new Test();
						question = new Question();
						answer = new Answer();
					}
				}

				count++;
			}
			System.out.println("Finished. Count = " + count);
			for (int index = 0; index < tests.size(); index++)
			{
				// Test testObj = tests.get(index);
				// System.out.println( testObj.getQuestion().getContent() );
				// System.out.println( "a) " + testObj.getAnswer().getAnswerA() );
				// System.out.println( "b) " + testObj.getAnswer().getAnswerB() );
				// System.out.println( "c) " + testObj.getAnswer().getAnswerC() );
				// System.out.println( "d) " + testObj.getAnswer().getAnswerD() );
				// System.out.println( "Correct answer: " +
				// testObj.getAnswer().getCorrectAnswerType().getName() );
				// System.out.println( "\n" );
			}
			System.out.println("Done !");

			writeFile(tests);
			System.out.println("Done !");

		}
		catch (IOException e)
		{

		}
	}

	public static void readFile1( String filePath )
	{
		File file = new File(filePath);
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			List<Test> tests = new ArrayList<Test>();
			Question question = new Question();
			Answer answer = new Answer();
			Test test = new Test();

			int answerIndex = 0;
			while ((line = br.readLine()) != null)
			{
				if (line != null && !line.isEmpty())
				{
					// Question
					if (line.contains("<task>"))
					{
						question.setContent(line.trim());
						question.setQuestionContentType(QuestionContentType.TEXT);
						test.setQuestion(question);
					}

					// Answer content
					String answerContent = "";
					if (line.contains("<var>"))
					{
						answerContent = line.trim();
						if (answerIndex == 0)
						{
							answer.setAnswerA(answerContent);
						}
						else if (answerIndex == 1)
						{
							answer.setAnswerB(answerContent);
						}
						else if (answerIndex == 2)
						{
							answer.setAnswerC(answerContent);
						}
						else if (answerIndex == 3)
						{
							answer.setAnswerD(answerContent);
						}
						answerIndex++;
					}

					if (line.contains("<exp>"))
					{
						answer.setExplaination(line.trim());
					}

					// Correct Answer
					if (line.contains("</question>"))
					{

						// Reset a Question with Answers
						test.setAnswer(answer);
						tests.add(test);

						test = new Test();
						question = new Question();
						answer = new Answer();

						answerIndex = 0;
					}
				}

			}

			writeFile(tests);
//			 for( int index = 0; index < tests.size(); index++ )
//			{
//				Test testObj = tests.get(index);
//				if (testObj != null && testObj.getQuestion().getContent() != null)
//				{
//					System.out.println(testObj.getQuestion().getContent());
//					System.out.println(testObj.getAnswer().getAnswerA());
//					System.out.println(testObj.getAnswer().getAnswerB());
//					System.out.println(testObj.getAnswer().getAnswerC());
//					System.out.println(testObj.getAnswer().getAnswerD());
//					System.out.println("exp: " + testObj.getAnswer().getExplaination());
//					System.out.println("----------------------------------------------------------\n");
//				}
//			}
		}
		catch (IOException e)
		{

		}
	}

	
	public static List<String> getEmailsFromFile( String sourceFilePath, String sourceFileName )
	{
		File file = new File(sourceFilePath);
		List<String> emailList = new ArrayList<String>();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null)
			{
				if (line != null && !line.isEmpty())
				{
					String data[] = line.split("	");
					if(data != null && data.length > 0){
						int length = data.length;
						int target = length - 1;
						String email = data[target];
						if(!email.isEmpty() && email.contains("@")){
							emailList.add(email);
						}
						System.out.println("\nEmail: " + email);
					}
				}

			}
			System.out.println("Finish get emails from text file:  Emails Size: " + emailList.size());

//			writeEmail(emailList);
		}
		catch (IOException e)
		{
			System.out.println("ERROR !");
		}
		
		return emailList;
	}
	
	public static void writeFile( List<Test> tests )
	{
		if (tests != null && tests.size() > 0)
		{
			try
			{

				File file = new File("D://binh.txt");

				// if file doesnt exists, then create it
				if (!file.exists())
				{
					file.createNewFile();
				}

				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);

				for (int index = 0; index < tests.size(); index++)
				{
					Test testObj = tests.get(index);
					if (testObj != null)
					{
						if (testObj.getQuestion().getContent() != null)
						{
							String content = testObj.getQuestion().getContent() + "," + testObj.getAnswer().getAnswerA()
									+ "," + testObj.getAnswer().getAnswerB() + "," + testObj.getAnswer().getAnswerC()
									+ "," + testObj.getAnswer().getAnswerD() + ","
									+ "Correct" + "," + testObj.getAnswer().getExplaination() + "\n";
							bw.write(content);
						}
					}
				}

				bw.close();
				fw.close();
				fw = null;
				bw = null;

				System.out.println("Done");

			}
			catch (IOException e)
			{
				System.out.println(e.getMessage()); 
				e.printStackTrace();
			}

		}
	}
	
	public static void writeEmail( List<String> emails, String targetFilePath )
	{
		if (emails != null && emails.size() > 0)
		{
			try
			{
				File file = new File(targetFilePath);

				// if file doesnt exists, then create it
				if (!file.exists())
				{
					file.createNewFile();
				}

				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);

				int count = 0;
				for (int index = 0; index < emails.size(); index++)
				{
					String testObj = emails.get(index);
					if (testObj != null)
					{
							String content = "";
							if(count == 5){
								content = testObj + "; \n";
								count = 0;
							}else{
								content = testObj + "; ";
							}
							bw.write(content);
							count++;
					}
				}

				bw.close();
				fw.close();
				fw = null;
				bw = null;

				System.out.println("Done");

			}
			catch (IOException e)
			{
				System.out.println(e.getMessage()); 
				e.printStackTrace();
			}

		}
	}

}
