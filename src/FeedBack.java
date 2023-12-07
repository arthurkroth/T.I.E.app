/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    import javax.swing.ButtonGroup;
    import javax.swing.JRadioButton;
    import javax.swing.JSlider;
    import javax.swing.JTextArea;
/**
 * FeedBack class represents the feedback provided by the user.
 * It includes the rating, whether the user would use the app again,
 * whether the user achieved their goals, and any additional feedback text.
 * Author: Cian O'Connor 
 * Student number: x22109668
 */
public class FeedBack {
    private int rating; 
    private boolean wouldUseAgain = true; 
    private boolean achievedGoals = true;
    private String feedbackText; 
    private User user; // Add this line

    // Constructor that takes a User instance
    public FeedBack(User user) {
        this.user = user;
    }
    
    /**
     * Sets the rating given by the user.
     * @param rating The user's rating.
     */
    public void setRating (int rating) {
        this.rating = rating; 
    }
    
    /**
     * Sets whether the user would use the app again.
     * @param wouldUseAgain True if the user would use the app again, false otherwise.
     */
    public void setWouldUseAgain (boolean wouldUseAgain) {
        this.wouldUseAgain = wouldUseAgain; 
    }
    
    /**
     * Sets whether the user achieved their goals.
     * @param achieveGoals True if the user achieved their goals, false otherwise.
     */
    public void setAchievedGoals(boolean achieveGoals) {
        this.achievedGoals = achievedGoals;
    }
    
    /**
     * Sets additional feedback text provided by the user.
     * @param feedbackText The feedback text.
     */
    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }
    
    /**
     * Processes the feedback and returns a result message.
     * @return A message based on the feedback.
     */
     public String processFeedback() {
if ((rating >= 4) && (wouldUseAgain || achievedGoals)) {
        // Positive feedback
        return "Thank you, " + user.getUserName() + " for your positive feedback! Your form has been sent to the team.";
    } else if (!(wouldUseAgain && achievedGoals)) {
        // Negative feedback (both are answered with "No")
        return "We're sorry to hear that, " + user.getUserName() + " We will take your feedback into account to improve our app.";
    } else {
        // Default or other cases
        return "Thank you for your feedback." + user.getUserName();
    }
     }
}
