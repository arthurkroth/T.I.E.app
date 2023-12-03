/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthurkroth
 */
public class User{
    private String userName;
    private int userAge;
    private int userHeigth;
    private double userWeight;
    private String userAddress;
    
    //Constructor with all parameters.
    public User(String userName, int userAge, int userHeigth,double userWeight, String userAddress){
        this.userName = userName;
        this.userAge = userAge;
        this.userHeigth = userHeigth;
        this.userWeight = userWeight;
        this.userAddress = userAddress;
    }
    
    //Default Constructor
    public User(){
        userName = "";
        userAge = 0;
        userHeigth = 0;
        userWeight = 0.0;
        userAddress = "";
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
    
    
    
}
