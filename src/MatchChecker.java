/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author ciano
 */
public class MatchChecker {
   
    
    private String communicationType;
    private String location;
    private String workType;
    
    public void setPreferences(String communicationType, String location, String workType) {
        this.communicationType = communicationType;
        this.location = location;
        this.workType = workType;
    }
    
    public ArrayList<String> getPossibleMatches () {
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
        ArrayList<String> matchedUserInfo = new ArrayList<>();

        for (String userInfo : possibleMatches) {
            String[] userInfoParts = userInfo.split(", ");
            String userCommunicationType = userInfoParts[2];
            String userLocation = userInfoParts[3];
            String userWorkType = userInfoParts[4];

            if (communicationType.equals(userCommunicationType) && location.equals(userLocation) && workType.equals(userWorkType)) {
                matchedUserInfo.add(userInfo);
            }
        }

        return matchedUserInfo;
    
    }
       
}

