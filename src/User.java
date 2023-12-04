/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class User extends UserGUI{
    private static User instance;
    
    private String userName;
    private int userAge;
    private int userHeight;
    private double userWeight;
    private String userAddress;
    private String userFitnessLevel;
    private int motivationLevel;
    
    //Constructor with all parameters.
    public User(String userName, int userAge, int userHeight, double userWeight, String userAddress, String userFitnessLevel, int motivationLevel){
        this.userName = userName;
        this.userAge = userAge;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
        this.userAddress = userAddress;
        this.userFitnessLevel = userFitnessLevel;
        this.motivationLevel = motivationLevel;
    }
    
    //Default Constructor
    public User(){
        userName = "";
        userAge = 0;
        userHeight = 0;
        userWeight = 0.0;
        userAddress = "";
        userFitnessLevel = "";
        motivationLevel = 0;
    }
    
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }
    

    //SETTERS
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserHeigth(int userHeigth) {
        this.userHeight = userHeigth;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserFitnessLevel(String userFitnessLevel) {
        this.userFitnessLevel = userFitnessLevel;
    }
    
    public void setMotivationLevel(int motivationLevel){
        this.motivationLevel = motivationLevel;
    }
    
    //GETTERS

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getUserHeigth() {
        return userHeight;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserFitnessLevel() {
        return userFitnessLevel;
    }

    public int getMotivationLevel(){
        return motivationLevel;
    }
    
    
    
    
}
