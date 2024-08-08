package com.jvtesteves.exercise02;

import java.util.ArrayList;
import java.util.List;

/*
Create a program that asks 5 questions to a person about a crime.
The questions are:

"Did you call the victim?"

"Were you at the crime scene?"

"Do you live near the victim?"

"Do you owe anything to the victim?"

"Have you ever worked with the victim?"

If the person answers positively to 2 questions, they should be classified as "Suspect",
between 3 and 4 as "Accomplice" and 5 as "Murderer". Otherwise, they will be classified as "Innocent".
*/

public class CrimeInvestigation {

    public static void main(String[] args) {

        // Initialize the list of questions
        List<String> questions = new ArrayList<>();
        questions.add("Did you call the victim?");
        questions.add("Were you at the crime scene?");
        questions.add("Do you live near the victim?");
        questions.add("Do you owe anything to the victim?");
        questions.add("Have you ever worked with the victim?");

        // Initialize the list of answers
        List<Boolean> answers = new ArrayList<>();
        answers.add(true);  // Example answer: Change it to get different results
        answers.add(false); // Example answer: Change it to get different results
        answers.add(true);  // Example answer: Change it to get different results
        answers.add(false); // Example answer: Change it to get different results
        answers.add(true);  // Example answer: Change it to get different results

        // Count the number of positive answers
        int positiveAnswers = 0;
        for (Boolean answer : answers) {
            if (answer) {
                positiveAnswers++;
            }
        }

        // Classify the person based on the number of positive answers
        String classification;
        if (positiveAnswers == 2) {
            classification = "Suspect";
        } else if (positiveAnswers >= 3 && positiveAnswers <= 4) {
            classification = "Accomplice";
        } else if (positiveAnswers == 5) {
            classification = "Murderer";
        } else {
            classification = "Innocent";
        }

        // Display the results
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i) + " " + (answers.get(i) ? "Yes" : "No"));
        }

        System.out.println("\nClassification: " + classification);
    }
}
