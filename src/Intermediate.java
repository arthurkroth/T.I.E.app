/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class Intermediate extends User{
    private final double suggestedHoursTraining = 1.5;
    private final int suggestedDaysTraining = 4;
    private int motivationLevel;
    
    public Intermediate(String userName, int userAge, int userHeigth,double userWeight, String userAddress, String userFitnessLevel, int motivationLevel){
        super();
        this.motivationLevel = motivationLevel;
    }
    
    public Intermediate(){
        
    }

    public double getSuggestedHoursTraining() {
        return suggestedHoursTraining;
    }

    public int getSuggestedDaysTraining() {
        return suggestedDaysTraining;
    }

    public int getMotivationLevel() {
        return motivationLevel;
    }

    public void setMotivationLevel(int motivationLevel) {
        this.motivationLevel = motivationLevel;
    }
    
}
