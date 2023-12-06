/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 * Class responsible for checking and finding workout buddy matches based on preferences.
 * Preferences include communication type, location, and workout type.
 * It provides methods to set preferences and get possible workout buddy matches.
 * Author: Cian O'Connor 
 * Student number: x22109668
 */
public class MatchChecker {
   
    // Member variables to store user preferences
    private String communicationType;
    private String location;
    private String workType;
    
    
    /**
     * Sets the communication type, location, and workout type preferences.
     * 
     * @param communicationType Preferred mode of communication (e.g., Email, Phone)
     * @param location Preferred location (e.g., Leinster, Munster)
     * @param workType Preferred workout type (e.g., Cardio, Crossfit)
     */
    public void setPreferences(String communicationType, String location, String workType) {
        this.communicationType = communicationType;
        this.location = location;
        this.workType = workType;
    }
    
     /**
     * Retrieves possible workout buddy matches based on the set preferences.
     * Dummy data is used for possible matches in this example.
     * 
     * @return ArrayList of strings representing possible workout buddy matches
     */
    public ArrayList<String> getPossibleMatches () {
        // data representing possible workout buddy matches
        ArrayList <String> possibleMatches = new ArrayList<>();
        
        if(communicationType != null && location != null && workType != null) {
        possibleMatches.add("Arthur Kroth, 24, Email, Leinser, Crossfit");
        possibleMatches.add("Michael McCreary, 25, Phone, Munster, Traditional strength");
        possibleMatches.add("Cian O'Connor, 24, In-Person, Connacht, Cardio");
        possibleMatches.add("Mark Wilson, 27, Email, Ulster, HIT");
        possibleMatches.add("Stephen Martin, 26, Phone, Leinster, Weightlifting");
        possibleMatches.add("Andrew Bates, 28, In-Person, Munster, Weightlifting");
        possibleMatches.add("Colin McCracken, 29, Email, Connacht, Cardio");
        possibleMatches.add("Paddy Ryan, 28, Phone, Ulster, Traditional strength");
        possibleMatches.add("Mike Flanagan, 25, In-Person, Leinster, Cardio");
        }
        // ArrayList to store matched user information
        ArrayList<String> matchedUserInfo = new ArrayList<>();
        
        // Iterate through possible matches and check for matches based on preferences
        for (String userInfo : possibleMatches) {
            // Split user information into parts
            String[] userInfoParts = userInfo.split(", ");
            String userCommunicationType = userInfoParts[2];
            String userLocation = userInfoParts[3];
            String userWorkType = userInfoParts[4];
            
            // Check if the user's preferences match the set preferences
            if (communicationType.equals(userCommunicationType) && 
                location.equals(userLocation) && 
                workType.equals(userWorkType)) {
                matchedUserInfo.add(userInfo);
            }
        }
        
        // Return the ArrayList of matched user information
        return matchedUserInfo;
    
    }
       
}

