/*
 * Copyright (c) 2015 Trinh Thanh Binh. All rights reserved.
 */
package com.saothienhat.projects.tracnghiem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author binhtt
 *
 */
public final class TestUtils
{
    public static void readFile(String filePath){
        File file = new File(filePath);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int count = 0;
            List<Test> tests = new ArrayList<Test>();
            Question question = new Question();
            Answer answer = new Answer();       
            Test test = new Test();
            
            while ((line = br.readLine()) != null) {      
                if( line != null && !line.isEmpty() )
                {
                    // Question
                    if ( Character.isDigit(line.charAt(0)) )
                    {
                        String questionContent = "Question " + line;
                        question.setContent( questionContent );
                        question.setQuestionContentType( QuestionContentType.TEXT );
                        test.setQuestion( question );
                    } 
                    
                    // Answer content
                    String answerContent = "";
                    if(line.contains( "a." )){
                        answerContent = line.replace( "a.", "" ).trim();
                        answer.setAnswerA( answerContent );
                    }else if(line.contains( "b." )){
                        answerContent = line.replace( "b.", "" ).trim();
                        answer.setAnswerB( answerContent );
                    }else if(line.contains( "c." )){
                        answerContent = line.replace( "c.", "" ).trim();
                        answer.setAnswerC( answerContent );
                    }else if(line.contains( "d." )){
                        answerContent = line.replace( "d.", "" ).trim();
                        answer.setAnswerD( answerContent );
                    }else if(line.contains( "e." )){
                        answerContent = line.replace( "e.", "" ).trim();
                        answer.setAnswerE( answerContent );
                    }
                    
                    // Correct Answer
                    if( line.contains( "--> " ) )
                    {
                        String correctAnswer = line.replace( "--> ", "" ).trim();
                        System.out.println( correctAnswer );
                        if( correctAnswer.equalsIgnoreCase( "a" ) )
                        {
                            answer.setCorrectAnswerType( CorrectAnswerType.A );
                        }
                        else if( correctAnswer.equalsIgnoreCase( "b" ) )
                        {
                            answer.setCorrectAnswerType( CorrectAnswerType.B );
                        }
                        else if( correctAnswer.equalsIgnoreCase( "c" ) )
                        {
                            answer.setCorrectAnswerType( CorrectAnswerType.C );
                        }
                        else if( correctAnswer.equalsIgnoreCase( "d" ) )
                        {
                            answer.setCorrectAnswerType( CorrectAnswerType.D );
                        }
                        else if( correctAnswer.equalsIgnoreCase( "e" ) )
                        {
                            answer.setCorrectAnswerType( CorrectAnswerType.E );
                        }
                        
                        // Reset a Question with Answers
                        
                        test.setAnswer( answer );
                        tests.add( test );
                        
                        test = new Test();
                        question = new Question();
                        answer = new Answer();   
                    }
                }
                
                count++;
            }
            System.out.println( "Finished. Count = " + count );
            for( int index = 0; index < tests.size(); index++ )
            {
                Test testObj = tests.get(index);
                System.out.println( testObj.getQuestion().getContent() );
                System.out.println( "a) " + testObj.getAnswer().getAnswerA() );
                System.out.println( "b) " + testObj.getAnswer().getAnswerB() );
                System.out.println( "c) " + testObj.getAnswer().getAnswerC() );
                System.out.println( "d) " + testObj.getAnswer().getAnswerD() );
                System.out.println( "Correct answer: " + testObj.getAnswer().getCorrectAnswerType().getName() ); 
                System.out.println( "\n" );
            }
        }catch(IOException e){
            
        }
    }
}
