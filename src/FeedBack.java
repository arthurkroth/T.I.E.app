/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    import javax.swing.ButtonGroup;
    import javax.swing.JRadioButton;
    import javax.swing.JSlider;
    import javax.swing.JTextArea;
/**
 *
 * @author ciano
 */
public class FeedBack {
    private int rating; 
    private boolean wouldUseAgain; 
    private boolean achievedGoals;
    private String feedbackText; 
    
    
    public void setRating (int rating) {
        this.rating = rating; 
    }
    
    public void setWouldUseAgain (boolean wouldUseAgain) {
        this.wouldUseAgain = wouldUseAgain; 
    }

    public void setAchievedGoals(boolean achieveGoals) {
        this.achievedGoals = achievedGoals;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }
    
     public String processFeedback() {
        if (rating <= 4 && wouldUseAgain && achievedGoals) {
            // Positive feedback
            return "Thank you for your positive feedback! Your form has been sent to the team.";
        } else {
            // Negative feedback
            return "We're sorry to hear that. We will take your feedback into account to improve our app.";
        }
        
     }
}
