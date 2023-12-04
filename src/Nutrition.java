
import javax.swing.JOptionPane;
 
/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
 
/**
*
* @author arthurkroth
*/
public class Nutrition {
 
    private int caloriesIntake;
    private int carbsIntake;
    private int proteinIntake;
    private int burnedCalories;
    
    User user = User.getInstance();
         
    String userName = user.getUserName();
    int userAge = user.getUserAge();
    int userHeigth = user.getUserHeigth();
    double userWeight = user.getUserWeight();
    String userAddress = user.getUserAddress();
    String userFitnessLevel = user.getUserFitnessLevel();
    int userMotivationLevel = user.getMotivationLevel();
 
    // Add constructor to initialize Nutrition with input values
    public Nutrition(int caloriesIntake, int carbsIntake, int proteinIntake, int burnedCalories) {
        this.caloriesIntake = caloriesIntake;
        this.carbsIntake = carbsIntake;
        this.proteinIntake = proteinIntake;
        this.burnedCalories = burnedCalories;
    }
 
    // Getter methods for retrieving calculated values
    public int getCaloriesIntake() {
        return caloriesIntake;
    }
 
    public int getCarbsIntake() {
        return carbsIntake;
    }
 
    public int getProteinIntake() {
        return proteinIntake;
    }
 
    public int getBurnedCalories() {
        return burnedCalories;
    }
 
    public String calculateNutrition() {
        // Perform your nutrition calculations here using the stored input values
        // For demonstration purposes, let's say we are just printing a message
        String message = "Calories Intake: " + caloriesIntake + "\n"
                + "Carbs Intake: " + carbsIntake + "\n"
                + "Protein Intake: " + proteinIntake + "\n"
                + "Burned Calories: " + burnedCalories;
        return message;
    }
    
    public double calculateBMI() {
    // BMI Formula: weight (kg) / height (m)^2
    double heightInMeters = userHeigth / 100.0; // Assuming userHeight is in centimeters
    return userWeight / (heightInMeters * heightInMeters);
}
    
    public String evaluateProteinIntake() {
        // Protein intake recommendation: depends on various factors, 
        // but let's assume a range (e.g., 0.8 - 1.2 grams per kg of body weight)
        double proteinPerKg = 1.0; // Set your recommended protein intake per kg here
        double totalProteinIntake = proteinIntake;

        double recommendedProteinIntakeLower = userWeight * 0.8 * proteinPerKg;
        double recommendedProteinIntakeUpper = userWeight * 1.2 * proteinPerKg;

        if (totalProteinIntake < recommendedProteinIntakeLower) {
            return "You are ingesting less protein than recommended.";
        } else if (totalProteinIntake >= recommendedProteinIntakeLower && 
                   totalProteinIntake <= recommendedProteinIntakeUpper) {
            return "Your protein intake is within the recommended range.";
        } else {
            return "You are ingesting more protein than recommended.";
        }
    }
    
        public String evaluateCarbsIntake() {
        // Similar evaluation can be done for carbs intake
        double totalCarbsIntake = carbsIntake;

        // Set your recommended carbs intake per day here
        double recommendedCarbsIntake = 250.0; // Assuming a value for recommended carbs intake

        if (totalCarbsIntake < recommendedCarbsIntake) {
            return "You are ingesting fewer carbs than recommended.";
        } else if (totalCarbsIntake == recommendedCarbsIntake) {
            return "Your carbs intake is within the recommended range.";
        } else {
            return "You are ingesting more carbs than recommended.";
        }
    }

    public String evaluateWeightChangeTrend() {
        // You might need more information to accurately predict weight change trends,
        // such as the user's current weight, past weight, physical activity level, etc.
        // Here, we'll use BMI to give a basic idea.

        double bmi = calculateBMI();

        if (bmi < 18.5) {
            return "You are underweight. Consider consulting with a healthcare professional.";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Your weight is within the normal range.";
        } else if (bmi >= 25.0 && bmi < 29.9) {
            return "You are overweight. Consider adjusting your diet and exercise routine.";
        } else {
            return "You are obese. It's important to manage your weight for better health.";
        }
    }
    
}
