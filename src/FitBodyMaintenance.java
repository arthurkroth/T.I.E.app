
import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class FitBodyMaintenance extends Fit{
    
    private double hoursExercised;
    private double hoursOutside;
    private int stepsTaken;
    private String fitGoal;
    
    public FitBodyMaintenance(double hoursExercised, double hoursOutside, int stepsTaken, String fitGoal) {
        super(hoursExercised, hoursOutside, stepsTaken, fitGoal);
        this.hoursExercised = hoursExercised;
        this.hoursOutside = hoursOutside;
        this.stepsTaken = stepsTaken;
        this.fitGoal = fitGoal;
    }
    
    @Override
        public String toString() {
        // Perform your nutrition calculations here using the stored input values
        // For demonstration purposes, let's say we are just printing a message
        String message = "Hours Exercised: " + hoursExercised + "\n"
                + "Hours Spent Outside: " + hoursOutside + "\n"
                + "Steps Taken: " + stepsTaken + "\n"
                + "Fitness Goal: " + fitGoal + "\n"
                + "Body Maintenance";
        return message;
    }
    
    @Override
    public double totalHoursExercised(){
        return hoursExercised + hoursOutside;
    }
        
        
    @Override
    public String getTotalInformation() {
        if (totalHoursExercised() < 4 && fitGoal.equals("Body Maintenance")) {
            return "Maintain a regular exercise routine and a balanced diet to preserve your current fitness!";
        } else if (totalHoursExercised() >= 4 && totalHoursExercised() <= 7 && fitGoal.equals("Body Maintenance")) {
            return "Balance your workouts and focus on maintaining a moderate level of physical activity!";
        } else if (totalHoursExercised() > 7 && fitGoal.equals("Body Maintenance")) {
            return "Prioritize rest and recovery while maintaining a consistent fitness routine for body maintenance!";
        } else {
            return "Consistency in exercise and nutrition is vital for preserving your current fitness level!";
        }
    }
    
    // Method to recommend a maintenance workout routine
    @Override
    public String suggestExercises() {
        ArrayList<String> exercises = new ArrayList<>();
        exercises.add("Try maintaining a consistent cardio routine like brisk walking or cycling.");
        exercises.add("Incorporate bodyweight exercises like push-ups, squats, and lunges into your workout.");
        exercises.add("Focus on flexibility training with yoga or stretching exercises.");
        exercises.add("Include low-impact activities such as swimming or gentle aerobics.");
        exercises.add("Engage in activities that promote relaxation and stress reduction, like meditation or tai chi.");

        Random random = new Random();
        int randomIndex = random.nextInt(exercises.size());
        
        return exercises.get(randomIndex);
    }
    
    @Override
    public String getEnoughSteps(){
        int minimumSteps = 10000;
        if (minimumSteps > stepsTaken) {
            return "You have " + stepsTaken + " out of " + minimumSteps + " recommended steps, just more " + (stepsTaken - minimumSteps) + " left!";
        } else {
            return "Amazing, keep up the good work! Doctors recommend at least 10k steps per day!";
        }
    }
    
}
