
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
public class FitFatLoss extends Fit{
    
    private double hoursExercised;
    private double hoursOutside;
    private int stepsTaken;
    private String fitGoal;
    
    public FitFatLoss(double hoursExercised, double hoursOutside, int stepsTaken, String fitGoal) {
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
                + "Fit Fat Loss";
        return message;
    }
    
        @Override
    public double totalHoursExercised(){
        return hoursExercised + hoursOutside;
    }
    
    
    @Override
    public String getTotalInformation() {
        if (totalHoursExercised() < 4 && fitGoal.equals("Fat Loss")) {
            return "Include HIIT workouts and monitor calorie intake for effective fat burning!";
        } else if (totalHoursExercised() >= 4 && totalHoursExercised() <= 7 && fitGoal.equals("Fat Loss")) {
            return "Incorporate a mix of cardio and strength training for steady fat loss!";
        } else if (totalHoursExercised() > 7 && fitGoal.equals("Fat Loss")) {
            return "Prioritize active recovery days and maintain a calorie deficit for consistent fat loss!";
        } else {
            return "Consistency in workouts and a balanced diet are crucial for sustainable fat loss!";
        }
    }
    
    // Method to suggest effective fat-burning exercises
    @Override
    public String suggestExercises() {
        ArrayList<String> fatBurningExercises = new ArrayList<>();
        fatBurningExercises.add("Try high-intensity interval training (HIIT) for effective fat burning.");
        fatBurningExercises.add("Consider adding plyometric exercises to your routine for fat loss.");
        fatBurningExercises.add("Incorporate jumping rope as a cardio exercise for burning calories.");
        fatBurningExercises.add("Combine strength training with cardio for optimal fat burning results.");
        fatBurningExercises.add("Include rowing or boxing workouts for a full-body fat-burning workout.");

        Random random = new Random();
        int randomIndex = random.nextInt(fatBurningExercises.size());
        
        return fatBurningExercises.get(randomIndex);
    }
    
        @Override
        public String getEnoughSteps(){
            int minimumSteps = 10000;
            if (minimumSteps > stepsTaken) {
                return "You have " + stepsTaken + " out of " + minimumSteps + " recommended steps, just more " + Math.abs(stepsTaken - minimumSteps) + " left!";
            } else {
                return "Amazing, keep up the good work! Doctors recommend at least 10k steps per day!";
        }
    }
    
    
}
