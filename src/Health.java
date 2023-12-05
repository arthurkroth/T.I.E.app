
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class Health {
    
    private double alcoholConsumed;
    private double waterConsumed;
    private double hoursOfSleep;
    private boolean isSmoker;
    
    
    private HealthList healthList;
    
    //
    User user = User.getInstance();
    double userWeight = user.getUserWeight();
    String userAddress = user.getUserAddress();
    String userFitnessLevel = user.getUserFitnessLevel();
    int userMotivationLevel = user.getMotivationLevel();
    
        // Add constructor to initialize Nutrition with input values
    public Health(double alcoholConsumed, double waterConsumed, double hoursOfSleep, boolean isSmoker) {
        this.alcoholConsumed = alcoholConsumed;
        this.waterConsumed = waterConsumed;
        this.hoursOfSleep = hoursOfSleep;
        this.isSmoker = isSmoker;
        
        // Instantiate the HealthList
        this.healthList = new HealthList();
        
    }
    
    
    
    // Getter methods for retrieving calculated values
    public double getAlcoholConsumed() {
        return alcoholConsumed;
    }
 
    public double getWaterConsumed() {
        return waterConsumed;
    }
 
    public double getHoursOfSleep() {
        return hoursOfSleep;
    }
 
    public boolean getIsSmoker() {
        return isSmoker;
    }
 
    @Override
    public String toString() {
        // Perform your health calculations here using the stored input values
        String message = "Alcohol Consumed: " + alcoholConsumed + "\n"
                + "Water Consumed: " + waterConsumed + "\n"
                + "Hours Of Sleep: " + hoursOfSleep + "\n"
                + "Smoker? " + isSmoker;
        return message;
    }
    
    //Method to provide the random tip from the arraylist(HealthList) if the user selects that is smoker.
    public String getRandomSmokerTip() {
        if (isSmoker) {
            return healthList.getRandomSmokerTip();
        }
        return "I'm really glad to know that you're not a smoker! Well done!";
    }
    
    public double calculateRecommendedWaterIntake() {
        // Typical recommendation: 30-35 milliliters per kilogram of body weight
        double waterIntakePerKg = 30; // Default value in milliliters

        // Calculate recommended water intake based on user's weight
        double recommendedWaterIntake = waterIntakePerKg * userWeight;
        return recommendedWaterIntake/1000;
    }
    
    public String recommendedWaterIntake(){
        
        if (waterConsumed < calculateRecommendedWaterIntake()) {
            return "Based on your weight, you should consume at least " + calculateRecommendedWaterIntake() + "L, " + waterConsumed + "L is not enough for good health!";
        } else {
            return "Well done, the minumum recomended for your weight is " + calculateRecommendedWaterIntake() + "L";
        }
    }
    
    public String generateSleepMessage(double hoursOfSleep) {
        final double recommendedSleepHours = 7.0; // Recommended hours of sleep

        if (hoursOfSleep >= recommendedSleepHours) {
            return "You're getting enough sleep. Keep it up!";
        } else {
            return "Consider getting more sleep for better health.";
        }
    }
    
    public String generateAlcoholMessage(){
        if (alcoholConsumed > 0.5) {
            return "Life is tough, but drinking alcohol everyday will not help, mind yourself";
        } else {
            return "";
        }
    }
}
