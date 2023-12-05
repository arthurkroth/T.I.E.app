/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class FitMuscleGain extends Fit{
    
    private double hoursExercised;
    private double hoursOutside;
    private int stepsTaken;
    private String fitGoal;
    
    public FitMuscleGain(double hoursExercised, double hoursOutside, int stepsTaken, String fitGoal) {
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
                + "Muscle Gain";
        return message;
    }
    
}
