/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class User{
    private static User instance;
    
    private String userName;
    private int userAge;
    private int userHeigth;
    private double userWeight;
    private String userAddress;
    private String userFitnessLevel;
    
    //Constructor with all parameters.
    public User(String userName, int userAge, int userHeigth,double userWeight, String userAddress, String userFitnessLevel){
        this.userName = userName;
        this.userAge = userAge;
        this.userHeigth = userHeigth;
        this.userWeight = userWeight;
        this.userAddress = userAddress;
        this.userFitnessLevel = userFitnessLevel;
    }
    
    //Default Constructor
    public User(){
        userName = "";
        userAge = 0;
        userHeigth = 0;
        userWeight = 0.0;
        userAddress = "";
        userFitnessLevel = "";
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
        this.userHeigth = userHeigth;
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
    
    
    //GETTERS

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getUserHeigth() {
        return userHeigth;
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

    void setMotivationLevel(int motivationLevel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
