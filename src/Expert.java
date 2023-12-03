/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class Expert  {
    private final double suggestedHoursTraining = 2.0;
    private final int suggestedDaysTraining = 6;
    private int consistencyLevel;
    
    public Expert(String userName, int userAge, int userHeigth,double userWeight, String userAddress, String userFitnessLevel, int consistencyLevel){
        super();
        this.consistencyLevel = consistencyLevel;
    }
    
    public Expert(){
        
    }

    public double getSuggestedHoursTraining() {
        return suggestedHoursTraining;
    }

    public int getSuggestedDaysTraining() {
        return suggestedDaysTraining;
    }

    public int getMotivationLevel() {
        return consistencyLevel;
    }

    public void setMotivationLevel(int motivationLevel) {
        this.consistencyLevel = motivationLevel;
    }
}
