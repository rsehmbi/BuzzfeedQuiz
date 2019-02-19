package com.company;
// Question class that contains the questions
class Question
{
    private String q;
    public Question(String q)
    {
        this.q = q;
    }
    //Since string q is private we need getters to get the question.
    public String getquestion()
    {
        return this.q;
    }
}