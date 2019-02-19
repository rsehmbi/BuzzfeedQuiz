//BUILDING A QUIZ THAT GIVES RESULTS BASED ON THE RESPONSES OF THE USER
//RAMANPREET SINGH STUDENT ID:301326893
package com.company;
import java.util.Scanner;
//Main class starts here
public class Main {
    public static void main(String[] args) {
	    // write your code here
        // Making five questions so that the user can input answers to this question
        String Q1 = "Which superpower you love the most ?\n" + "a) To fly \nb) Super Strong\nc) Spider Webs \nd) Water Control\n";
        String Q2 = "Physical apperance?\n" + "a) Buff \nb) Oversize\nc) Slim \nd) Muscular\n";
        String Q3 = "What is your favourite costume color ?\n"+ "a) Blue\nb) Green\nc) Red\nd) No costume\n";
        String Q4 = "Whom you want to live with ?\n"+ "a) Other Superheros\nb) Girlfriend\nc) Your Aunt\nd) Brother\n";
        String Q5 = "What is your favourite book genre?\n"+ "a) Fiction\nb) Drama\nc) Comedy\nd) Horror\n";
        //Creating an array of object that contains questions, since there is no correct answer(user can choose any option)
        Question [] questions = {new Question(Q1),new Question(Q2),new Question(Q3),new Question(Q4),new Question(Q5)
        };
        startQuiz(questions);//Function that will run the quiz on the start of program.
    }
    public static void startQuiz(Question [] questions)
    {
        System.out.println("Welcome to the Buzzfeedquiz game that determines which superhero you are :) \n");
        System.out.println("Please answer a , b , c or d ");
        int total_score = 0;
        int points = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < questions.length ; i++)
        {
            System.out.println(questions[i].getquestion());
            String answer = input.nextLine();
            if (answer.equals("a"))
            {
                points = 1;
            }
            else if (answer.equals("b"))
            {
                points = 2;
            }
            else if (answer.equals("c"))
            {
                points = 3;
            }
            else if (answer.equals("d"))
            {
                points = 4;
            }
            else
            {
                i = --i;//Loop to the same question again and again if user inputs choices that are not listed above.
                System.out.println("The answer you choose is not in options.Please use the correct input and TRY AGAIN !");
            }
            total_score = total_score + points;
        }

        if (total_score > 0 && total_score <= 5)
        {
            System.out.println("You are Superman");
            System.out.println("You are strong and smart.You are one of the most powerful superheroes.You brave with a heart of gold and love to save people lives.");
        }
        else if (total_score > 5 && total_score <= 10)
        {
            System.out.println("You are Hulk");
            System.out.println("You are big and bulky. You can smash anyone with your powers and size. You become normal human being when you see the person you love.");
        }
        else if (total_score > 10 && total_score <= 15)
        {
            System.out.println("You are Spiderman");
            System.out.println("You are the favourite of kids and you're a kid. You never listen to Tony Stark but you follow what's fair for everyone. Your spider-sense and spiderwebs helps you in fighting.");
        }
        else
            {
            System.out.println("You are Aquaman");
            System.out.println("You are god of Water and you can control it. You're eyes are devil and you save all the living-beings in water because you consider them your family."); }
    }
}
