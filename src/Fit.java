/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public abstract class Fit {
    
    private double hoursExercised;
    private double hoursOutside;
    private int stepsTaken;
    private String fitGoal;

    
    
    User user = User.getInstance();
         
    String userName = user.getUserName();
    int userAge = user.getUserAge();
    int userHeigth = user.getUserHeigth();
    double userWeight = user.getUserWeight();
    String userAddress = user.getUserAddress();
    String userFitnessLevel = user.getUserFitnessLevel();
    int userMotivationLevel = user.getMotivationLevel();
   
    
    
    // Add constructor to initialize Nutrition with input values
    public Fit(double hoursExercised, double hoursOutside, int stepsTaken, String fitGoal) {
        this.hoursExercised = hoursExercised;
        this.hoursOutside = hoursOutside;
        this.stepsTaken = stepsTaken;
        this.fitGoal = fitGoal;
    }
    
        // Getter methods for retrieving calculated values
    public double getHoursExercised() {
        return hoursExercised;
    }
 
    public double getHoursOutside() {
        return hoursOutside;
    }
 
    public int getStepsTaken() {
        return stepsTaken;
    }
 
    public String getFitGoal() {
        return fitGoal;
    }
    
        @Override
    public String toString() {
        // Perform your nutrition calculations here using the stored input values
        // For demonstration purposes, let's say we are just printing a message
        String message = "Hours Exercised: " + hoursExercised + "\n"
                + "Hours Spent Outside: " + hoursOutside + "\n"
                + "Steps Taken: " + stepsTaken + "\n"
                + "Fitness Goal: " + fitGoal;
        return message;
    }
    
    public double totalHoursExercised(){
        return hoursExercised + hoursOutside;
    }
    
    public String getTotalInformation(){
        return "Total information";
    }
    
    public String getEnoughSteps(){
        int minimumSteps = 10000;
        if (minimumSteps > stepsTaken) {
            return "You have " + stepsTaken + " out of " + minimumSteps + " recommended steps, just more " + Math.abs(stepsTaken - minimumSteps) + " left!";
        } else {
            return "Amazing, keep up the good work! Doctors recommend at least 10k steps per day!";
        }
    }
    
    public String suggestExercises() {
        return "";
    }
    
    
}
