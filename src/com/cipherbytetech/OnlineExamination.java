package com.cipherbytetech;

import java.util.Scanner;

public class OnlineExamination {

		
		    private static Scanner sc = new Scanner(System.in);

		    public static void main(String[] args) {
		        System.out.println("Welcome to the Online Exam System!");

		        System.out.print("Enter your username: ");
		        String username = sc.nextLine();

		        System.out.print("Enter your password: ");
		        String password = sc.nextLine();
		        
		            System.out.println("Login successful!");
		            
		            if(username!=password) {

		            int score = 0;
		            String[] questions = {
		                "Who invented java",
		                "Which data type is used to store text in Java?",
		                "What is the output of 4 + 9 * 2?",
		                "Which keyword is used to define a class in Java?",
		                "What does JVM stand for?",
		                "Which of the following is not a primitive data type in Java?",
		                "What does the 'static' keyword mean in Java?",
		                "Which loop is guaranteed to execute at least once in Java?",
		                "What is the correct way to declare a constant in Java?",
		                "What is the output of 'Hello' + 'World' in Java?"
		            };
		            String[][] options = {
		                {"a) Guido van Rossum", "b) James Gosling", "c) Brendan Eich", "d)  Bjarne Stroustrup"},
		                {"a) int", "b) char", "c) float", "d) String"},
		                {"a) 22", "b) 26", "c) 13", "d) 17"},
		                {"a) class", "b) void", "c) int", "d) string"},
		                {"a) Java Virtual Machine", "b) Java Very Main", "c) Java Variable Model", "d) None of the above"},
		                {"a) char", "b) string", "c) double", "d) boolean"},
		                {"a) It belongs to the instance of the class", "b) It belongs to the class itself", "c) It is used for garbage collection", "d) None of the above"},
		                {"a) for loop", "b) while loop", "c) do-while loop", "d) switch loop"},
		                {"a) final int CONSTANT = 10;", "b) const int CONSTANT = 10;", "c) int CONSTANT = 10;", "d) final CONSTANT = 10;"},
		                {"a) HelloWorld", "b) HelloWorld", "c) Hello + World", "d) Compilation Error"}
		            };
		            String[] answers = {"b", "d", "c", "a", "a", "b", "b", "c", "a", "b"};

		            for (int i = 0; i < questions.length; i++) {
		                System.out.println("Question " + (i + 1) + ": " + questions[i]);
		                for (int j = 0; j < options[i].length; j++) {
		                    System.out.println(options[i][j]);
		                }
		                System.out.print("Enter your choice (a, b, c, or d): ");
		                String answer = sc.nextLine();

		                if (answer.equalsIgnoreCase(answers[i])) {
		                    System.out.println("Correct answer!");
		                    score++;
		                } else {
		                    System.out.println("Incorrect answer!");
		                }
		            }

		            System.out.println("Your score: " + score + " out of " + questions.length);
		        
		         
		           System.err.println("Invalid username or password. Please try again.");
		        }

		        System.out.println("Thank you for using the Online Exam System!");
		    }

		    
	   }

	


